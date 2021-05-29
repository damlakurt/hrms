package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertise;

public interface JobAdvertiseService {
	
	Result add(JobAdvertise jobAdvertise);
	Result delete(JobAdvertise jobAdvertise);
	Result update(JobAdvertise jobAdvertise);
	
	DataResult<List<JobAdvertise>> getAll();
	DataResult<List<JobAdvertise>>findAllByEnableTrue(); 

	DataResult<List<JobAdvertise>>findAllByEnableTrueOrderByCreatedAtDesc(); 
	
	
	DataResult<List<JobAdvertise>>findAllEnableTrueByEmployer(int id);

}
