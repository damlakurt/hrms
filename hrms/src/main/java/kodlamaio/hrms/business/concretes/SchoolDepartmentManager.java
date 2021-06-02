package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SchoolDepartmentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolDepartmentDao;
import kodlamaio.hrms.entities.concretes.SchoolDepartment;
@Service
public class SchoolDepartmentManager implements SchoolDepartmentService{
	
private SchoolDepartmentDao sdepartmentdao;
	
@Autowired
	
	public SchoolDepartmentManager(SchoolDepartmentDao sdepartmentdao) {
	super();
	this.sdepartmentdao = sdepartmentdao;
}

	@Override
	public DataResult<List<SchoolDepartment>> getall() {
	return new SuccesDataResult<List<SchoolDepartment>>(this.sdepartmentdao.findAll());
	}

	@Override
	public Result add(SchoolDepartment schoolDepartment) {
		this.sdepartmentdao.save(schoolDepartment);
		return new SuccesResult();
	}

	@Override
	public Result delete(SchoolDepartment schoolDepartment) {
		this.sdepartmentdao.delete(schoolDepartment);
		return new SuccesResult();
	}

	@Override
	public Result update(SchoolDepartment schoolDepartment) {
		this.sdepartmentdao.save(schoolDepartment);
		return new SuccesResult();
	}

}
