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
@Table(name = "work_time")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobAdvertises"})
public class WorkTime {
	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String workTime;

	 @OneToMany(mappedBy = "workTime")
	    private List<JobAdvertise> jobAdvertises;
}
