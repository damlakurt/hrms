package kodlamaio.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Photo;

public interface PhotoDao extends JpaRepository<Photo, Integer>{
	List<Photo> findByOrderById();

}
