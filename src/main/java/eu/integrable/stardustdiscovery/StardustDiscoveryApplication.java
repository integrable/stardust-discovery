package eu.integrable.stardustdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StardustDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(StardustDiscoveryApplication.class, args);
    }

}
