package pl.sdacademy.mvc.ModelViewController.service;


import org.springframework.stereotype.Service;

@Service
public class GreetingService  {

    public String greetingFromService () {
        return "Greeting from Service!";
    }
}
