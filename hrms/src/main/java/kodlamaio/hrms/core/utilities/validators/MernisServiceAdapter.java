package kodlamaio.hrms.core.utilities.validators
;

import kodlamaio.hrms.FakeMernisService;

public class MernisServiceAdapter implements UserCheckService{


	@Override
	public boolean userCheck(String nationalityId, String firstName, String lastName, int yearOfBirth) {
	
		FakeMernisService fakeMernisService=new FakeMernisService();
		boolean result= true;
		try {
			result=fakeMernisService.userValidationWithMernis(nationalityId, firstName, lastName, yearOfBirth);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
			
		}
		
		
	}

	

	


