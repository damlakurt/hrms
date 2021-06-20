package kodlamaio.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.hrms.entities.concretes.JobAdvertise;


public interface JobAdvertiseDao  extends JpaRepository<JobAdvertise, Integer>{
	
	

	List<JobAdvertise>getAllByEnableTrue(); //aktif iş ilanları

	List<JobAdvertise>getAllByEnableTrueOrderByCreatedAtDesc(); //tarihe göre aktif iş ilanları
	
	@Query("From JobAdvertise where employer_id=:id")
	List<JobAdvertise>getAllEnableTrueByEmployer(int id); //bir firmanın aktif iş ilanları
	
	
	List<JobAdvertise> getByIsConfirm(boolean isConfirm);
	List<JobAdvertise> getByIsConfirmAndEnable(boolean isConfirm, boolean enable);
	
	
	
	
	
	
	

}
