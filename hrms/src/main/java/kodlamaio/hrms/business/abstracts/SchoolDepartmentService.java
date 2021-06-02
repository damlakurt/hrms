package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SchoolDepartment;

public interface SchoolDepartmentService {
	DataResult<List<SchoolDepartment>> getall();
	Result add(SchoolDepartment schoolDepartment);
	Result delete(SchoolDepartment schoolDepartment);
	Result update(SchoolDepartment schoolDepartment);
	
	

}
