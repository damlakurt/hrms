package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;


@Service
public class JobPositionManager implements JobPositionService{
	
	private JobPositionDao jobDao ;
	
	@Autowired

	public JobPositionManager(JobPositionDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccesDataResult<List<JobPosition>>
				(this.jobDao.findAll());
		
	}

	@Override
	public Result add(JobPosition jobPosition) {
		this.jobDao.save(jobPosition);
		
		return new SuccesResult("İş Pozisyonu Eklendi");
	}

	@Override
	public Result delete(JobPosition jobPosition) {
	this.jobDao.delete(jobPosition);
		return new SuccesResult("İş Pozisyonu Silindi ");
	}

}
