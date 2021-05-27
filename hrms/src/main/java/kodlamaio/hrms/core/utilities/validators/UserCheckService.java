package kodlamaio.hrms.core.utilities.validators;

import java.time.LocalDate;

public interface UserCheckService {
	
	public boolean userCheck(String firstname,String lastname, String nationalId, LocalDate birthOfDate);
	

}
