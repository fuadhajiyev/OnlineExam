package az.online.exam.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	@Column(name = "firstname", length = 50, nullable = false)
	public String fname;

	@Column(name = "lastname", length = 50, nullable = false)
	private String lname;

	@Column(name = "email", length = 80, nullable = true)
	private String email;

	
	// Public methods

	
	
	

}