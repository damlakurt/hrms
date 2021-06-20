package kodlamaio.hrms.api.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.WorkPlaceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.entities.concretes.WorkPlace;

@RestController
@RequestMapping("/workPlace")
@CrossOrigin
public class WorkPlacesController {
	  private WorkPlaceService workPlaceService;

	    @Autowired
	    public WorkPlacesController(WorkPlaceService workPlaceService) {
	        this.workPlaceService = workPlaceService;
	    }

	    @GetMapping("/getAll")
	    public DataResult<List<WorkPlace>> getAll(){
	        return this.workPlaceService.getAll();
	    }

}
