package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.SocialMedia;

public interface SocialMediaService {
	DataResult<List<SocialMedia>> getall();
	Result add(SocialMedia socialMedia);
	Result delete(SocialMedia socialMedia);
	Result update(SocialMedia socialMedia);


}
