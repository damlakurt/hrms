package kodlamaio.hrms;

import java.time.LocalDate;

public class FakeMernisService {
	
	

	public boolean userValidationWithMernis(String nationalId, String firstname, String lastname,
			LocalDate birthOfDate) {
		System.out.println(firstname + " " + lastname + " " +"is valid person ." );
		return true;
	}

}
