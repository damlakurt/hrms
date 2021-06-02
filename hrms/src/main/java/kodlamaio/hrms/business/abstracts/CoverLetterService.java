package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.CoverLetter;

public interface CoverLetterService {
	
	DataResult<List<CoverLetter>> getall();
	Result add(CoverLetter coverLetter);
	Result delete(CoverLetter coverLetter);
	Result update(CoverLetter coverLetter);


}
