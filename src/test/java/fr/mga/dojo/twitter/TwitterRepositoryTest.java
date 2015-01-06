package fr.mga.dojo.twitter;

import org.fest.assertions.api.Assertions;
import org.junit.Test;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

import java.util.Arrays;
import java.util.List;

public class TwitterRepositoryTest {

    @Test
    public void should_connect_to_twitter() {
        TwitterTemplate template = new TwitterTemplate("MO9NKEk8e3ErastRnqSOrUAbF","NxOrtHCPzWkKGj247YkIgQn5yEkjzH0G6NRCjHz1awzYtwaBvc");
        TwitterRepository twitterRepository = new TwitterRepository(template);
        List<String> descriptions = twitterRepository.findDescription(Arrays.asList("m_gandin"));
        Assertions.assertThat(descriptions).isNotEmpty();
        Assertions.assertThat(descriptions).contains("I program my home computer / Beam myself into the future");
    }
}
