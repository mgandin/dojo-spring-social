package fr.mga.dojo.twitter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class HelloResource {

    private TwitterRepository twitterRepository;

    @Autowired
    public HelloResource(TwitterRepository twitterRepository) {
        this.twitterRepository = twitterRepository;
    }

	@RequestMapping("/description")
    public String description(@RequestParam(value="name", defaultValue="World") String name) {
        return "{\"description\": " + twitterRepository.findDescription(Arrays.asList(name)) + "}";
    }
}
