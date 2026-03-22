package cv.api.openapis_dev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class OpenapisDevApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapisDevApplication.class, args);
	}

}
