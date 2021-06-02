package kodlamaio.hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity

@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "job_seekers")

@EqualsAndHashCode(callSuper=false)

public class Jobseeker extends User {
	

@NotBlank(message = "Boş Geçilemez")
	@Column(name = "firstname")
private	String firstName;

@NotBlank(message = "Boş Geçilemez")
	@Column(name = "lastname")
private	String lastName;
	
@NotBlank(message = "Boş Geçilemez")
	@Column(name = "nationality_id")
private	String nationalityId;
	
@NotBlank(message = "Boş Geçilemez")	
@Column(name = "birthdate")
private	Date yearOfBirth;
	
	@ManyToOne
@JoinColumn(name = "resume_id")
private Resume resume;





}