package work.tangthinker.microserviceconsumermovie.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import work.tangthinker.microserviceconsumermovie.entity.User;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/13 20:53 星期六
 * @file UserFeignClient
 * @project SpringCloud
 */
@FeignClient(name = "MICROSERVICE-PROVIDER-USER")
public interface UserFeignClient {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") Long id);
}
