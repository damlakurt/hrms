package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertiseService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertise;
@CrossOrigin
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
	public DataResult<List<JobAdvertise>> getAllByEnableTrue(){
		return this.jobAdvertiseService.getAllByEnableTrue();

}
	@GetMapping("/findAllByEnableTrueOrderByCreatedAtDesc")
	public DataResult<List<JobAdvertise>> getAllByEnableTrueOrderByCreatedAtDesc(){
		return this.jobAdvertiseService.getAllByEnableTrueOrderByCreatedAtDesc();
	}
	@GetMapping("/findAllEnableTrueByEmployer")
	public DataResult<List<JobAdvertise>> getAllEnableTrueByEmployer(int id){
		return this.jobAdvertiseService.getAllEnableTrueByEmployer(id);
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
	}
		
	
		

		@GetMapping("/getByIsConfirmAndEnable")
		public DataResult<List<JobAdvertise>> getByIsConfirmAndEnable(@RequestParam boolean isConfirm,
				@RequestParam boolean enable) {
			return this.jobAdvertiseService.getByIsConfirmAndEnable(isConfirm, enable);
	}}
