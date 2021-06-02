package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.LanguageService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.LanguageDao;
import kodlamaio.hrms.entities.concretes.Language;
@Service
public class LanguageManager implements LanguageService {
	
	private LanguageDao languagedao;
	
	
	@Autowired

	public LanguageManager(LanguageDao languagedao) {
		super();
		this.languagedao = languagedao;
	}

	@Override
	public DataResult<List<Language>> getall() {
		return new SuccesDataResult<List<Language>>(this.languagedao.findAll());
	}

	@Override
	public Result add(Language language) {
		this.languagedao.save(language);
		return new SuccesResult();
	}

	@Override
	public Result delete(Language language) {
		this.languagedao.delete(language);
		return new SuccesResult();	}

	@Override
	public Result update(Language language) {
		this.languagedao.save(language);
		return new SuccesResult();
	}

}
