package fr.mga.dojo.twitter;

import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.impl.TwitterTemplate;

import java.util.List;

public class TwitterRepository {

    private TwitterTemplate twitterTemplate;

    public TwitterRepository(TwitterTemplate twitterTemplate) {
        this.twitterTemplate = twitterTemplate;
    }

    List<String> findDescription(List<String> users) {
        List<String> result = Lists.newArrayList();
        for (String user : users) {
            result.add(twitterTemplate.userOperations().getUsers(user).get(0).getDescription());
        }
        return result;
    }
}
