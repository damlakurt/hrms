package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.dataAccess.abstracts.JobseekerDao;
import kodlamaio.hrms.entities.concretes.Jobseeker;

@Service

public class JobseekerManager implements JobseekerService{
	
	private JobseekerDao jobseekerDao;
	
	@Autowired

	public JobseekerManager(JobseekerDao jobseekerDao) {
		super();
		this.jobseekerDao = jobseekerDao;
	}



	@Override
	public DataResult<List<Jobseeker>> getAll() {
	
		return new SuccesDataResult<List<Jobseeker>>
		(this.jobseekerDao.findAll());
	}



	@Override
	public DataResult<Jobseeker> getJobseekerNationalıd(String nationalityId) {
		
		return new SuccesDataResult<Jobseeker>(this.jobseekerDao.findByNationalityId(nationalityId));
	

}
}