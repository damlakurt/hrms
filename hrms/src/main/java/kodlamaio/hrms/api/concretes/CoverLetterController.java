package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CoverLetterService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CoverLetter;

@RestController
@RequestMapping("/api/coverletters")
public class CoverLetterController {
	
	private CoverLetterService coverLetterService;
	
	@Autowired
	public CoverLetterController(CoverLetterService coverLetterService) {
		super();
		this.coverLetterService = coverLetterService;
	}
	@GetMapping("/getall")
	public DataResult<List<CoverLetter>> getAll(){
		return this.coverLetterService.getall();
	}
	@PostMapping("/add")
	public Result add(@RequestBody CoverLetter coverLetter) {
		return this.coverLetterService.add(coverLetter);
	}

}
