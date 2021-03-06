package kodlamaio.hrms.entities.concretes;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "school_departments")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","schools"})

public class SchoolDepartment {
	

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@Column(name = "department_name")
	 private String departmentName;
	
	@OneToMany(mappedBy = "schoolDepartment")
	private List<School>schools;
}
