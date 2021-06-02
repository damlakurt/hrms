package kodlamaio.hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SocialMediaService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.SocialMediaDao;
import kodlamaio.hrms.entities.concretes.SocialMedia;

@Service
public class SocialMediaManager implements SocialMediaService {
	
	private SocialMediaDao socialmediadao;
	
@Autowired
	public SocialMediaManager(SocialMediaDao socialmediadao) {
		super();
		this.socialmediadao = socialmediadao;
	}

	@Override
	public DataResult<List<SocialMedia>> getall() {
	return new SuccesDataResult<List<SocialMedia>>(this.socialmediadao.findAll());
	}

	@Override
	public Result add(SocialMedia socialMedia) {
		this.socialmediadao.save(socialMedia);
		return new SuccesResult();
	}

	@Override
	public Result delete(SocialMedia socialMedia) {
		this.socialmediadao.delete(socialMedia);
		return new SuccesResult();
	}

	@Override
	public Result update(SocialMedia socialMedia) {
		this.socialmediadao.save(socialMedia);
		return new SuccesResult();
	}

}
