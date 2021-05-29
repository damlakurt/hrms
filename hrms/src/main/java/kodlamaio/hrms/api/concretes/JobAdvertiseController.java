package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertiseService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertise;

@RequestMapping("/api/jobadvertises")
@RestController
public class JobAdvertiseController {
	
	private JobAdvertiseService jobAdvertiseService;
@Autowired
	public JobAdvertiseController(JobAdvertiseService jobAdvertiseService) {
		super();
		this.jobAdvertiseService = jobAdvertiseService;
	}
	@GetMapping("/getall")
	public DataResult<List<JobAdvertise>> getAll(){
		return this.jobAdvertiseService.getAll();
	}
	@GetMapping("/findAllByEnableTrue")
	public DataResult<List<JobAdvertise>> findAllByEnableTrue(){
		return this.jobAdvertiseService.findAllByEnableTrue();

}
	@GetMapping("/findAllByEnableTrueOrderByCreatedAtDesc")
	public DataResult<List<JobAdvertise>> findAllByEnableTrueOrderByCreatedAtDesc(){
		return this.jobAdvertiseService.findAllByEnableTrueOrderByCreatedAtDesc();
	}
	@GetMapping("/findAllEnableTrueByEmployer")
	public DataResult<List<JobAdvertise>> findAllEnableTrueByEmployer(int id){
		return this.jobAdvertiseService.findAllEnableTrueByEmployer(id);
	}
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertise jobAdvertise) {
		return this.jobAdvertiseService.add(jobAdvertise);
	}
	@PostMapping("/delete")
	public Result delete(@RequestBody JobAdvertise jobAdvertise) {
		return this.jobAdvertiseService.delete(jobAdvertise);
}
	@PostMapping("/update")
	public Result update(@RequestBody JobAdvertise jobAdvertise) {
		return this.jobAdvertiseService.update(jobAdvertise);
	}}
