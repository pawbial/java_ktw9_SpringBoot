package pl.sdacademy.spring_boot_web.SpringBootWebApp.model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @RequestMapping("/")
    public String helloWorldString() {
        return "Hello World! Spriong Boot Web App!";
    }
}

    public MyCourse
