package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ResumeService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.ResumeDao;
import kodlamaio.hrms.entities.concretes.Resume;
@Service
public class ResumeManager implements ResumeService{
	
	private ResumeDao resumedao;
	
	@Autowired

	public ResumeManager(ResumeDao resumedao) {
		super();
		this.resumedao = resumedao;
	}

	@Override
	public DataResult<List<Resume>> getall() {
		return new SuccesDataResult<List<Resume>>(this.resumedao.findAll());
		
	}

	@Override
	public Result add(Resume resume) {
		this.resumedao.save(resume);
		return new SuccesResult();
	}

	@Override
	public Result delete(Resume resume) {
		this.resumedao.delete(resume);
		return new SuccesResult();
	}

	@Override
	public Result update(Resume resume) {
		this.resumedao.save(resume);
		return new SuccesResult();
	}

}
