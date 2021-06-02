package kodlamaio.hrms.api.concretes;


import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.hrms.business.abstracts.PhotoService;
import kodlamaio.hrms.core.utilities.services.CloudinaryService;
import kodlamaio.hrms.entities.concretes.Photo;

@RequestMapping("/cloudinary")
@RestController
@CrossOrigin
public class PhotoController {
	
	private CloudinaryService cloudinaryService;
	private PhotoService photoService;
	
	@Autowired
	public PhotoController(PhotoService photoService, CloudinaryService cloudinaryService) {
		super();
		this.photoService = photoService;
		this.cloudinaryService=cloudinaryService;
	}
	@GetMapping("getAll")
	public ResponseEntity<List<Photo>> getall(){
		List<Photo> list =this.photoService.getall().getData();
		return new ResponseEntity(list,HttpStatus.OK);
	}
	@PostMapping("/upload")
	public ResponseEntity<?> upload (@RequestParam MultipartFile multipartFile) throws IOException{
		
		BufferedImage bufferedImage = ImageIO.read(multipartFile.getInputStream());
		if(bufferedImage == null) {
			
			return new ResponseEntity("Resim validasyonu başarısız.", HttpStatus.BAD_REQUEST);
		}			
		
		Map result =cloudinaryService.upload(multipartFile);
		Photo photo = new Photo(0, null);
		
		this.photoService.add(photo );
		
		
		return new ResponseEntity("Image saved.", HttpStatus.OK);
}
}