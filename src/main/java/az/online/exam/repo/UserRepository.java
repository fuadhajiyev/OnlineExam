package az.online.exam.repo;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import az.online.exam.models.User;

@Repository
public class UserRepository {
	
	@Autowired
	private EntityManager entityManager;
	
	
	@Transactional
	public void save(User user) {
		
		entityManager.persist(user);
		
	}

}
