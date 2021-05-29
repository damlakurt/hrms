package kodlamaio.hrms.core.utilities.validators;


import org.springframework.stereotype.Service;

@Service
public interface UserCheckService {
	
	public boolean userCheck(String nationalityId,String firstName,String lastName,int yearOfBirth);
	
	

}
