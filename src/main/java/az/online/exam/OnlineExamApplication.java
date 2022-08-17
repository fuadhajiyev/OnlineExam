package az.online.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import az.online.exam.models.User;
import az.online.exam.repo.UserRepository;



@SpringBootApplication
@EnableAutoConfiguration
public class OnlineExamApplication implements CommandLineRunner {

	
	 @Autowired
	 private UserRepository userRepository;
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(OnlineExamApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
//		createUser();		
	}
	

	private void  createUser() {
		User user = new User();
//		user.setFname("Fuad");
//		user.setLname("Hacıyev");
//		user.setEmail("hajiyev@1996gmail.com");
//		userRepository.save(user);
	}

}
