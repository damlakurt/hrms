package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "positions")
@AllArgsConstructor
@NoArgsConstructor

public class JobPosition {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	@Column(name = "id")
	
	int id;
	
	@Column(name = "position_name")

	String jobPositionName;
	

}
