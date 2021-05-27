package kodlamaio.hrms.core.utilities.validators
;

import java.time.LocalDate;

import kodlamaio.hrms.FakeMernisService;

public class FakeMernisServiceAdapter implements UserCheckService{

	

	@Override

	public boolean userCheck(String firstname, String lastname, String nationalId, LocalDate birthOfDate) {
	boolean result =false;
	FakeMernisService fakeMernisService = new FakeMernisService();
	result=fakeMernisService.userValidationWithMernis(nationalId, firstname, lastname, birthOfDate);
	return result;
	}

}
