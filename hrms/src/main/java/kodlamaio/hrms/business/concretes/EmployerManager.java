package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmployerService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.SuccesDataResult;
import kodlamaio.hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.hrms.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService{
	
	private EmployerDao employerdao;
	
	@Autowired

	public EmployerManager(EmployerDao employerdao) {
		super();
		this.employerdao = employerdao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccesDataResult<List<Employer>>(this.employerdao.findAll());
		
	}
	
	
	
	

}
