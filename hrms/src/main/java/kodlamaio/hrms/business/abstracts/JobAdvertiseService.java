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
	
	DataResult<List<JobAdvertise>> getByIsConfirm(boolean isConfirm);
	DataResult<List<JobAdvertise>> getByIsConfirmAndEnable(boolean isConfirm, boolean enable);
	
	DataResult<List<JobAdvertise>>getAllByEnableTrue(); 

	DataResult<List<JobAdvertise>>getAllByEnableTrueOrderByCreatedAtDesc(); 
	
	
	DataResult<List<JobAdvertise>>getAllEnableTrueByEmployer(int id);
	
	
	

}
