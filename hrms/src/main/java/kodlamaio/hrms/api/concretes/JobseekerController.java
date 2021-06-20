package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobseekerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.Jobseeker;
@CrossOrigin
@RestController
@RequestMapping("api/jobseekers")
public class JobseekerController {
	
	private JobseekerService jobseekerService;
	
@Autowired
	public JobseekerController(JobseekerService jobseekerService) {
		super();
		this.jobseekerService = jobseekerService;
	}
	
@GetMapping("/getall")
public DataResult<List<Jobseeker>>getAll(){
	return this.jobseekerService.getAll();
}
}
