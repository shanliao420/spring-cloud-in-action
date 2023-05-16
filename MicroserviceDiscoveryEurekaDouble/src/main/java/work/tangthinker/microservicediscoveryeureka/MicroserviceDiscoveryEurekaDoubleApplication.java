package work.tangthinker.microservicediscoveryeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceDiscoveryEurekaDoubleApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceDiscoveryEurekaDoubleApplication.class, args);
    }

}
