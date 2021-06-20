package kodlamaio.hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "resumes")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler","jobseekers"})
public class Resume {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;
	
	@ManyToOne()
	@JoinColumn(name = "language_id")
	private Language language;
	
	@ManyToOne()
	@JoinColumn(name = "photo_id")
	private Photo photo;
	
	@ManyToOne()
	@JoinColumn(name = "school_id")
	private School school;
	
	@ManyToOne()
    @JoinColumn(name = "social_media_id")
	private SocialMedia socialMedia;
	
	@ManyToOne()
    @JoinColumn(name = "experience_id")
	private Experience experience;
	
	@ManyToOne()
    @JoinColumn(name = "ability_id")
	private Abilitiy ability;
	
	@ManyToOne()
    @JoinColumn(name = "cover_letters_id")
	private CoverLetter coverLetter;
	
	@OneToMany(mappedBy = "resume")
	private List<Jobseeker> jobseekers;

}
