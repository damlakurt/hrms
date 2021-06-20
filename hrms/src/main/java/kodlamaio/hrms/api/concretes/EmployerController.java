package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Employer;
@CrossOrigin
@RequestMapping("api/employers")
@RestController

public class EmployerController {
	private EmployerService employerService;
@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
@GetMapping("/getall")
public DataResult<List<Employer>>getAll(){
	return this.employerService.getAll();
}

	
	

}
