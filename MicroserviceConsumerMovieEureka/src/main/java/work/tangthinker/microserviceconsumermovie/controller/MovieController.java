package work.tangthinker.microserviceconsumermovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import work.tangthinker.microserviceconsumermovie.entity.User;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/10 19:59 星期三
 * @file MovieController
 * @project SpringCloud
 */
@RestController
public class MovieController {


    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServer.url}")
    private String userServerUrl;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject(userServerUrl + id, User.class);
    }



}
