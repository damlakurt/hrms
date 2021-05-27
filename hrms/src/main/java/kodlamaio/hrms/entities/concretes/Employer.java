package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data

@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "employers")
@AllArgsConstructor
@NoArgsConstructor


@EqualsAndHashCode(callSuper = false) 


public class Employer extends User {

	@Column(name = "company_id")

	private String companyName;

	@Column(name = "web_address")

	private String webAddress;

	@Column(name = "phone_number")

	private String phoneNumber;

	@Column(name = "verified_bySystem")

	private String VerifiedBySystem;

}
