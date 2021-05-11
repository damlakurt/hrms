package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;


@Service
public class JobManager implements JobPositionService{
	
	private JobPositionDao jobDao ;
	
	@Autowired

	public JobManager(JobPositionDao jobDao) {
		super();
		this.jobDao = jobDao;
	}

	@Override
	public List<JobPosition> getAll() {
		return this.jobDao.findAll();
		
	}

}
