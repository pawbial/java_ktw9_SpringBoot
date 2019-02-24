package pl.sdacademy.spring_boot.SpringBootEasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import pl.sdacademy.spring_boot.SpringBootEasy.model.HelloWorld;

import java.util.logging.Logger;

@SpringBootApplication
public class SpringBootEasyApplication {

	private static final Logger LOG = Logger.getLogger(SpringBootEasyApplication.class.getName());

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootEasyApplication.class, args);



		LOG.info("=================");

		HelloWorld helloWorld = run.getBean(HelloWorld.class);

		helloWorld.logHelloWorld();
	}

}
