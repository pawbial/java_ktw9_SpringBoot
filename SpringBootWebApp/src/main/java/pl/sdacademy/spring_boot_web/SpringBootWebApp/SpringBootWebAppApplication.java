package pl.sdacademy.spring_boot_web.SpringBootWebApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sdacademy.spring_boot_web.SpringBootWebApp.model.MyController;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootWebAppApplication {


	private static final Logger LOG = Logger.getLogger(SpringBootWebAppApplication.class.getName());

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(SpringBootWebAppApplication.class, args);

		MyController myController = (MyController) run.getBean("myController");

		LOG.info(myController.helloWorldString());
	}

}
