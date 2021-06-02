package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.ExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Experience;


@RestController
@RequestMapping("/api/experiences")
public class ExperienceController {
	private ExperienceService experienceService;

	public ExperienceController(ExperienceService experienceService) {
		super();
		this.experienceService = experienceService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Experience>> getAll(){
		return this.experienceService.getall();
	}
	@PostMapping("/add")
	public Result add(@RequestBody Experience experience) {
		return this.experienceService.add(experience);
	}
	
	@GetMapping("/getAllByPositionNameOrderByQuitDateDesc")
	public DataResult<List<Experience>> getAllByPositionNameOrderByQuitDateDesc(String positionName){
		return this.experienceService.getAllByPositionNameOrderByQuitDateDesc(positionName);

}
}