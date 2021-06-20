package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "workplace")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertises"})
public class WorkPlace {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String workPlaceName;
	
	  @OneToMany(mappedBy = "workPlace")
	    private List<JobAdvertise> jobAdvertises;

}
