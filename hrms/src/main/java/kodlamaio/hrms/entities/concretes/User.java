package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data

@Inheritance(strategy = InheritanceType.JOINED)

@Table(name = "users")


@AllArgsConstructor
@NoArgsConstructor


public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonIgnore
	@Column(name = "id")
	private	int id;
	
	@Email
	@NotBlank
	@NotNull
	@Column(name = "email")
	private	String email;
	
	
	@NotBlank
	@NotNull
	@Column(name = "password")
	private String password;
	
	@Column(name = "confirmPassword")
	private String confirmPassword;
	
	@Column(name = "email_verified")
	private boolean isVerified;
	
	
	
	

}
