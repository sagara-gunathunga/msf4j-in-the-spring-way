package org.wso2.msf4j.samples.spring.sample2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

    @Bean
    public Hello hello() {
        return new Hello();
    }

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
