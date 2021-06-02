package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.AbilitiyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.AbilitiyDao;
import kodlamaio.hrms.entities.concretes.Abilitiy;
@Service
public class AbilitiyManager implements AbilitiyService{
	
	private AbilitiyDao abilitiydao;

	@Autowired
	public AbilitiyManager(AbilitiyDao abilitiydao) {
		super();
		this.abilitiydao = abilitiydao;
	}

	@Override
	public DataResult<List<Abilitiy>> getall() {
		return new SuccesDataResult<List<Abilitiy>>(this.abilitiydao.findAll());
	}

	@Override
	public Result add(Abilitiy abilitiy) {
		this.abilitiydao.save(abilitiy);
		return new SuccesResult();
	}

	@Override
	public Result delete(Abilitiy abilitiy) {
		this.abilitiydao.delete(abilitiy);
		return new SuccesResult();
	}

	@Override
	public Result update(Abilitiy abilitiy) {
		this.abilitiydao.save(abilitiy);
		return new SuccesResult();
	}

}
