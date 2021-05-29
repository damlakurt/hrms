package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.DepartmentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.DepartmentDao;
import kodlamaio.hrms.entities.concretes.Department;
@Service
public class DepartmentManager implements DepartmentService{
	
	private DepartmentDao departmentDao;

	@Override
	public DataResult<List<Department>> getAll() {
		return new SuccesDataResult<List<Department>>(this.departmentDao.findAll());
	}

	@Override
	public Result add(Department department) {
		this.departmentDao.save(department);
		return new SuccesResult("Departman Eklendi");
	}

	@Override
	public Result delete(Department department) {
		this.departmentDao.delete(department);
		return new SuccesResult("Departman Silindi");
	}

}
