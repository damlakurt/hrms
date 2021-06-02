package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.ExperienceService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.ExperienceDao;
import kodlamaio.hrms.entities.concretes.Experience;

@Service

public class ExperienceManager implements ExperienceService {
	
	private ExperienceDao experiencedao;

	@Autowired
	public ExperienceManager(ExperienceDao experiencedao) {
		super();
		this.experiencedao = experiencedao;
	}

	@Override
	public DataResult<List<Experience>> getall() {
		return new SuccesDataResult<List<Experience>>(this.experiencedao.findAll());
	}

	

	@Override
	public Result add(Experience experience) {
		this.experiencedao.save(experience);
		return new SuccesResult();
	}

	@Override
	public Result delete(Experience experience) {
		this.experiencedao.delete(experience);
		return new SuccesResult();
	}

	@Override
	public Result update(Experience experience) {
		this.experiencedao.save(experience);
		return new SuccesResult();
	}

	@Override
	public DataResult<List<Experience>> getAllByPositionNameOrderByQuitDateDesc(String positionName) {
		return new SuccesDataResult<List<Experience>>(this.experiencedao.getAllByPositionNameOrderByQuitDateDesc(positionName));
	}

}
