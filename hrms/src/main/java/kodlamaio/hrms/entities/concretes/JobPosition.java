package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "positions")

public class JobPosition {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	
	@Column(name = "id")
	
	int id;
	
	@Column(name = "position_name")

	String jobPositionName;
	
	
public JobPosition() {
	
}


public JobPosition(int id, String jobPositionName) {
	super();
	this.id = id;
	this.jobPositionName = jobPositionName;
}
}
