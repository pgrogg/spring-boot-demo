package ch.sbb.hop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hi {

    @RequestMapping("/")
    public String hi() {
        return "Hi Frasy!";
    }
}



