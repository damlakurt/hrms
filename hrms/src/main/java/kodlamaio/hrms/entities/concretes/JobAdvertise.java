package kodlamaio.hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "job_advertisements")
public class JobAdvertise {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	
	@ManyToOne
    @JoinColumn(name = "employer_id")
	private Employer employer;
	
    @Column(name = "job_description")
	private String jobDescription;
    
    @ManyToOne
    @JoinColumn(name = "job_id")
    private JobPosition jobPosition;
    
    @ManyToOne
    @JoinColumn(name = "city_id")
	private City city;
	
    @Column(name = "min_salary")
	private int minSalary;
	
    @Column(name = "max_salary")
	private int maxSalary;
	
    @Column(name = "number_of_open_positions")
	private int numberOfOpenPosition;
    
    @Column(name = "created_at")
	private LocalDate createdAt;
	
    @Column(name = "application_deadline ")
	private LocalDate applicationDeadline ;
	
    @Column(name = "enable")
    private boolean enable;
    
    @Column(name = "is_confirm")
	private boolean isConfirm;
	
    @ManyToOne()
    @JoinColumn(name = "workplace_id")
    private WorkPlace workPlace;

    @ManyToOne()
    @JoinColumn(name = "work_time_id")
    private WorkTime workTime;
}
