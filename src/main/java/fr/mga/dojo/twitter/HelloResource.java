package fr.mga.dojo.twitter;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {

	@RequestMapping("/hello")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return "{\"content\" : \"Hello" + name +"\"}";
    }
}
