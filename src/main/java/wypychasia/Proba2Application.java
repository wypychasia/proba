package wypychasia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Proba2Application {

	public static void main(String[] args) {
		SpringApplication.run(Proba2Application.class, args);
	}

	@Bean
	public Loader loader(){
		return new Loader();
	}
}

