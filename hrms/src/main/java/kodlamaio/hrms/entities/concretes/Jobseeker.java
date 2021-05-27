package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

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
	


	@Column(name = "firstname")
private	String firstName;
	
	@Column(name = "lastname")
private	String lastName;
	
	
	@Column(name = "nationality_id")
private	String nationalityId;
	
	@Column(name = "birthdate")
private	int yearOfBirth;
	








}