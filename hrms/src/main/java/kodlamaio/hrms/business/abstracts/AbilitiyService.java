package kodlamaio.hrms.business.abstracts;

import java.util.List;



import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Abilitiy;

public interface AbilitiyService {
	DataResult<List<Abilitiy>> getall();
 Result add(Abilitiy abilitiy);
 Result delete(Abilitiy abilitiy);
 Result update(Abilitiy abilitiy);

}
