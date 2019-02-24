package pl.sdacademy.mvc.ModelViewController.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.sdacademy.mvc.ModelViewController.service.GreetingService;

@Controller
public class GreetingController {

    @Autowired
    private GreetingService service;

    @GetMapping ("/greeting")
    public String greeting (@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name",name);
        model.addAttribute("model","123456789");
        return "greet";
    }

    @GetMapping ("/greetingService")
    @ResponseBody
    public String controllerGreetingFromService (Model model) {
        return service.greetingFromService();
    }
}
