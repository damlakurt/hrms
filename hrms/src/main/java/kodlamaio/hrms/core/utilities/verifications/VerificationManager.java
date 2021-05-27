package kodlamaio.hrms.core.utilities.verifications;

public class VerificationManager implements VerificationService {

	@Override
	public void sendEmail(String email) {
		System.out.println("Dogrulama linki gönderildi" + " " +  email );
		
	}

}
