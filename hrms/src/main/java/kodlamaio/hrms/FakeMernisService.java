package kodlamaio.hrms;


public class FakeMernisService {
	
	

	public boolean userValidationWithMernis(String nationalId, String firstname, String lastname,
			int yearOfBirth) {
		System.out.println(firstname + " " + lastname + " " +"is valid person ." );
		return true;
	}

}
