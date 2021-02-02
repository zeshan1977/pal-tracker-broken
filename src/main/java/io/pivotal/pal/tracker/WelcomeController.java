package io.pivotal.pal.tracker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private final String mesg;

    public WelcomeController(@Value("${welcome.message}") String mesg) {
        this.mesg = mesg;
    }
    @GetMapping("/")
    public String sayHello() {
        return mesg;
    }
}