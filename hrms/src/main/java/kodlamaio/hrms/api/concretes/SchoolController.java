package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;


@RestController
@RequestMapping("/api/schools")
public class SchoolController {
	private SchoolService schoolService;
@Autowired
	public SchoolController(SchoolService schoolService) {
		super();
		this.schoolService = schoolService;
	}
	@GetMapping("/getall")
	public DataResult<List<School>> getall(){
		return this.schoolService.getall();
	}
	@PostMapping("add")
	public Result add(@RequestBody School school) {
		return this.schoolService.add(school);
		
	}
	@PostMapping("delete")
	public Result delete(@RequestBody School school) {
		return this.schoolService.delete(school);

}
	
	@GetMapping("/getAllBySchoolNameOrderByGraduationDateDesc")
	public DataResult<List<School>> getAllBySchoolNameOrderByGraduationDateDesc(String schoolName){
		return this.schoolService.getAllBySchoolNameOrderByGraduationDateDesc(schoolName);
	}
}