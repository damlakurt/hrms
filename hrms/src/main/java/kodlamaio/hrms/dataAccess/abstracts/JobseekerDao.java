package kodlamaio.hrms.dataAccess.abstracts;

//package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface JobseekerDao  extends JpaRepository<Jobseeker, Integer>{
	
	Jobseeker findByNationalityId(String nationalityid);

}
