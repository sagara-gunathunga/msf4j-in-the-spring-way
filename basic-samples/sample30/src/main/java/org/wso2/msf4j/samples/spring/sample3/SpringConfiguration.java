package org.wso2.msf4j.samples.spring.sample3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.msf4j.spring.transport.HTTPTransportConfig;

@Configuration
public class SpringConfiguration {

    @Bean
    public HTTPTransportConfig http() {
        return new HTTPTransportConfig(6060);
    }
}
