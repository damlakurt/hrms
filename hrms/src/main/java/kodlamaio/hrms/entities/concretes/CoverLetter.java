package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cover_letters")
public class CoverLetter {
	@Id
	@GeneratedValue
	@Column(name = "id")
private	int id;

	@Column(name = "text")
	private String text;
}
