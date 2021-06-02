package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.AbilitiyService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Abilitiy;

@RequestMapping("/api/abilities")
@RestController
public class AbilitiyController {
	
	private AbilitiyService abilitiyService;
	
	@Autowired

	public AbilitiyController(AbilitiyService abilitiyService) {
		super();
		this.abilitiyService = abilitiyService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Abilitiy>> getAll(){
		return this.abilitiyService.getall();
	}
	       
	@PostMapping("/add")
	public Result add(@RequestBody Abilitiy abilitiy) {
		return this.abilitiyService.add(abilitiy);
	}

}
