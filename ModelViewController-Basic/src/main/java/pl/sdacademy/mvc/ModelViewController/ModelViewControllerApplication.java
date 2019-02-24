package pl.sdacademy.mvc.ModelViewController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sdacademy.mvc.ModelViewController.model.GreetingController;

import java.util.logging.Logger;

@SpringBootApplication
public class ModelViewControllerApplication {

	private static final Logger LOG = Logger.getLogger(ModelViewControllerApplication.class.getName());

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(ModelViewControllerApplication.class, args);





	}

}
