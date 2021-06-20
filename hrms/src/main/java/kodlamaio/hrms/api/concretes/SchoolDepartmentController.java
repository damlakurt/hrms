package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SchoolDepartmentService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SchoolDepartment;
@CrossOrigin
@RestController
@RequestMapping("/api/schooldepartments")
public class SchoolDepartmentController {
	
	private SchoolDepartmentService schoolDepartmentService;
@Autowired
	public SchoolDepartmentController(SchoolDepartmentService schoolDepartmentService) {
		super();
		this.schoolDepartmentService = schoolDepartmentService;
	}

@GetMapping("/getall")
public DataResult<List<SchoolDepartment>> getall(){
	return this.schoolDepartmentService.getall();
	
}
@PostMapping("/add")
public Result add(@RequestBody SchoolDepartment schoolDepartment) {
	return this.schoolDepartmentService.add(schoolDepartment);
}
	@PostMapping("/delete")
	public Result delete(@RequestBody SchoolDepartment schoolDepartment) {
		return this.schoolDepartmentService.delete(schoolDepartment);

}

}