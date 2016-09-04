package org.wso2.msf4j.samples.spring.sample12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GreetingConfiguration {

    @Value("${msg.greeting:Hello}")
    private String greeting;

    @Bean
    public HelloService helloService() {
        return new HelloService(greeting);
    }
}
