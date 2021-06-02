package kodlamaio.hrms.business.abstracts;

import java.util.List;


import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.School;

public interface SchoolService {
	DataResult<List<School>> getall();
	DataResult<List<School>>getAllBySchoolNameOrderByGraduationDateDesc(String schoolName);
	Result add(School school);
	Result delete(School school);
	Result update(School school);


}
