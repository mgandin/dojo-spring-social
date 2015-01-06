package fr.mga.dojo.twitter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

@ComponentScan
@EnableAutoConfiguration
public class Application {

    @Bean
    public TwitterRepository twitterRepository() {
        TwitterTemplate template = new TwitterTemplate("MO9NKEk8e3ErastRnqSOrUAbF","NxOrtHCPzWkKGj247YkIgQn5yEkjzH0G6NRCjHz1awzYtwaBvc");

        return new TwitterRepository(template);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}