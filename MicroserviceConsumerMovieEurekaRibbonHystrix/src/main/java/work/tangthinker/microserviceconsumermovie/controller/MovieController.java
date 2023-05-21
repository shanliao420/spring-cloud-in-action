package work.tangthinker.microserviceconsumermovie.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
@Slf4j
public class MovieController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.userServer.url}")
    private String userServerUrl;

    @HystrixCommand(fallbackMethod = "fallback")
    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
        return this.restTemplate.getForObject(userServerUrl + id, User.class);
    }

    public void fallback(){
        System.out.println("Hello Hystrix!");
    }

    @GetMapping("/log-user-instance")
    public String logUserInstance(){
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user");
        log.info("serviceInstanceId:" + serviceInstance.getInstanceId() + " host:" + serviceInstance.getHost()
         + " port:" + serviceInstance.getPort());
        return "serviceInstanceId:" + serviceInstance.getInstanceId() + " host:" + serviceInstance.getHost()
                + " port:" + serviceInstance.getPort();
    }





}
