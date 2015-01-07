package fr.mga.dojo.twitter;

import org.fest.assertions.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.social.twitter.api.impl.TwitterTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class TwitterRepositoryTest {

    @Autowired
    private TwitterRepository twitterRepository;

    @Test
    public void should_connect_to_twitter() {
        List<String> descriptions = twitterRepository.findDescription(Arrays.asList("m_gandin"));
        Assertions.assertThat(descriptions).isNotEmpty();
        Assertions.assertThat(descriptions).contains("I program my home computer / Beam myself into the future");
    }
}
