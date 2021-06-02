package kodlamaio.hrms.business.abstracts;

import java.util.List;
import java.util.Optional;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Photo;

public interface PhotoService {
	DataResult<List<Photo>> getall();
	DataResult<Optional<Photo>> getById(int id);
	Result add(Photo photo);
	Result delete(Photo photo);
	Result update(Photo photo);

	

}
