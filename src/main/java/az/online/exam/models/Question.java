package az.online.exam.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name="questions")
public class Question {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long id;
	
	
	@Column(name = "summary", length = 500, nullable = false)
	private  String summary;
	
	@OneToMany(mappedBy = "question")
	private List<PossibleAnswer> possibleAnswer;
	

	

}
