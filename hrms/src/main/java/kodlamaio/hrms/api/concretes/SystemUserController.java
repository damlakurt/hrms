package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.SystemUserService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.SystemUser;
@CrossOrigin
@RestController
@RequestMapping("api/systemusers")
public class SystemUserController {
	
	private SystemUserService systemUserService;
	
	
@Autowired
	public SystemUserController(SystemUserService systemUserService) {
		super();
		this.systemUserService = systemUserService;
	}
	
  @GetMapping("/getall")
  public DataResult<List<SystemUser>>getAll(){
	  return this.systemUserService.getAll();
	  

}

}
