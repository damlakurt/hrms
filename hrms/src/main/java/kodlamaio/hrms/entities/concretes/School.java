package kodlamaio.hrms.entities.concretes;


import java.util.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "schools")
@NoArgsConstructor
@AllArgsConstructor
public class School {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotBlank(message = "Boş Geçilemez")
	@Column(name = "school_name")
	private String schoolName;
	
	@NotBlank(message = "Boş Geçilemez")
	@Column(name = "entry_date")
	private Date entryDate;
	
	@Column(name = "date_of_graduation")
	private Date graduationDate;
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private SchoolDepartment schoolDepartment;
	


}
