package caller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
public class ApplicationTest { //NOSONAR squid:S1118 add private constructor

    public static void main(final String[] args) {

        SpringApplication.run(ApplicationTest.class, args);
    }
}