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
@EqualsAndHashCode(callSuper = false)
@Table(name = "system_users")
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
public class SystemUser extends User  {
	
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)

@Column(name = "user_id")	
private	int id;
	
	
@Column(name = "system_user_name")
private	String firstName;

	
@Column(name = "system_user_surname")
private	String lastName;


@Column(name = "department_id")
private	int departmentId;




	
	

}
