package work.tangthinker.microserviceconsumermovie.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author shanliao420@yeah.net
 * @date 2023/5/13 20:03 星期六
 * @file RibbonConfiguration
 * @project SpringCloud
 */
@Configuration
public class RibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        return new RandomRule();
    }



}
