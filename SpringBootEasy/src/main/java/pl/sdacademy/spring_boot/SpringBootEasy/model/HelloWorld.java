package pl.sdacademy.spring_boot.SpringBootEasy.model;

import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
public class HelloWorld {

    private static final Logger LOG = Logger.getLogger(HelloWorld.class.getName());


    public void logHelloWorld() {
        LOG.info("Hello World! Spring Boot Easy vol. 1");
    }

}
