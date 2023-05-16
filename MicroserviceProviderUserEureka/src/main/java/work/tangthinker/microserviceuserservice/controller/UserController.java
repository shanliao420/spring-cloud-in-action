package work.tangthinker.microserviceuserservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import work.tangthinker.microserviceuserservice.dao.UserRepository;
import work.tangthinker.microserviceuserservice.entity.User;

import java.util.Optional;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/10 19:11 星期三
 * @file UserController
 * @project SpringCloud
 */
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        Optional<User> findById = this.userRepository.findById(id);
        return findById.get();
    }



}
