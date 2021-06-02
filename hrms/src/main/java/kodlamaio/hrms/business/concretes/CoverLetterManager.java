package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.CoverLetterDao;
import kodlamaio.hrms.entities.concretes.CoverLetter;
@Service
public class CoverLetterManager implements CoverLetterService {
	
	private CoverLetterDao cldao;
	
@Autowired
	public CoverLetterManager(CoverLetterDao cldao) {
		super();
		this.cldao = cldao;
	}

	@Override
	public DataResult<List<CoverLetter>> getall() {
	return new SuccesDataResult<List<CoverLetter>>(this.cldao.findAll());
	}

	@Override
	public Result add(CoverLetter coverLetter) {
		this.cldao.save(coverLetter);
		return new SuccesResult();
	}

	@Override
	public Result delete(CoverLetter coverLetter) {
		this.cldao.delete(coverLetter);
		return new SuccesResult();
	}

	@Override
	public Result update(CoverLetter coverLetter) {
		this.cldao.save(coverLetter);
		return new SuccesResult();
	}

}
