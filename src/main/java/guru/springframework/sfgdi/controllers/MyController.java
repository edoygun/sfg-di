package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.PrimaryGreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController(PrimaryGreetingService primaryGreetingService) {
        this.greetingService = primaryGreetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
