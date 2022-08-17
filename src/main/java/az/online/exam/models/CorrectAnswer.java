package az.online.exam.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="correct_answer")
public class CorrectAnswer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;

//	@Column(name = "answer_id", nullable = false)
//	public int answer_id;
//	
//	@Column(name = "question_id", nullable = false)
//	public int question_id;
	
	
	
	@OneToOne
	@JoinColumn(name = "possible_id")
	private List<PossibleAnswer> possibleAnswer;
	

	
	@OneToOne
	@JoinColumn(name = "question_id")
	private Question correctAnswer;

}
