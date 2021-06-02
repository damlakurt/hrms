package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SchoolService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.core.utilities.results.SuccesResult;
import kodlamaio.hrms.dataAccess.abstracts.SchoolDao;
import kodlamaio.hrms.entities.concretes.School;
@Service
public class SchoolManager implements SchoolService {
	
	private SchoolDao schooldao;
	
	@Autowired

	public SchoolManager(SchoolDao schooldao) {
		super();
		this.schooldao = schooldao;
	}

	@Override
	public DataResult<List<School>> getall() {
		return new SuccesDataResult<List<School>>(this.schooldao.findAll());
	}

	@Override
	public DataResult<List<School>> getAllBySchoolNameOrderByGraduationDateDesc(String schoolName) {
		return new SuccesDataResult<List<School>>(this.schooldao.getAllBySchoolNameOrderByGraduationDateDesc(schoolName));
	}

	@Override
	public Result add(School school) {
		this.schooldao.save(school);
		return new SuccesResult("Okul Eklendi");
	}

	@Override
	public Result delete(School school) {
		this.schooldao.delete(school);
		return new SuccesResult("Okul Silindi");
	}

	@Override
	public Result update(School school) {
		this.schooldao.save(school);
		return new SuccesResult("Okul Güncellendi");

}
}
