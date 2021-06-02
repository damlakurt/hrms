package kodlamaio.hrms.entities.concretes;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "work_experiences")
public class Experience {

	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@NotBlank(message = "Boş Geçilemez")
	@Column(name = "workplace_name")
	private String workplaceName;
	
	@Column(name = "position_name")
	private String positionName;
	
	@NotBlank(message = "Boş Geçilemez")
	@Column(name="entry_date")
	private Date entryDate;
	
	@Column(name = "quit_name")
	private Date quitDate;
	
}
