package az.online.exam.models;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "user_answer")
@Access(value=AccessType.FIELD)
public class UserAnswer {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

	@Column(name = "user_id", nullable = false)
	private int user_id;
	
	@Column(name = "question_id", nullable = false)
	private int question_id;
	
	
	@Column(name = "answer_id", nullable = false)
	private int answer_id;

	
	
	
	

}
