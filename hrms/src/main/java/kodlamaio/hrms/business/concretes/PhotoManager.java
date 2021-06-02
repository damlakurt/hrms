package kodlamaio.hrms.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.PhotoDao;
import kodlamaio.hrms.entities.concretes.Photo;
@Service
public class PhotoManager implements PhotoService{
	
	private PhotoDao photodao;
	
@Autowired
	public PhotoManager(PhotoDao photodao) {
		super();
		this.photodao = photodao;
	}

	@Override
	public DataResult<List<Photo>> getall() {
		return new SuccesDataResult<List<Photo>>(this.photodao.findAll());
	}

	@Override
	public Result add(Photo photo) {
		this.photodao.save(photo);
		return new SuccesResult("Fotograf Eklendi ");
	}

	@Override
	public Result delete(Photo photo) {
		this.photodao.delete(photo);
		return new SuccesResult();
	}

	@Override
	public Result update(Photo photo) {
		this.photodao.save(photo);
		return new SuccesResult();
	}

	@Override
	public DataResult<Optional<Photo>> getById(int id) {
		return new SuccesDataResult<Optional<Photo>>(this.photodao.findById(id));

}}
