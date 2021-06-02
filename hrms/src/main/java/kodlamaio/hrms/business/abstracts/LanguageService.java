package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Language;

public interface LanguageService {
	DataResult<List<Language>> getall();
	Result add(Language language);
	Result delete(Language language);
	Result update(Language language);
}
