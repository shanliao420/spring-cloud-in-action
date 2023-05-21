package work.tangthinker.microserviceconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix // @EnableCircuitBreaker 效果一样
public class MicroserviceConsumerMovieEurekaRibbonHystrixApplication {


	@Bean
	@LoadBalanced  // 配置负载均衡 为restTemplate整合Ribbon
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerMovieEurekaRibbonHystrixApplication.class, args);
	}

}

