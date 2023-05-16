package work.tangthinker.microserviceconsumermovie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MicroserviceConsumerMovieEurekaRibbonRandomApplication {


	@Bean
	@LoadBalanced  // 配置负载均衡 为restTemplate整合Ribbon
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceConsumerMovieEurekaRibbonRandomApplication.class, args);
	}

}
