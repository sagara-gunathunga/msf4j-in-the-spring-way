package org.wso2.msf4j.samples.spring.sample10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.msf4j.spring.transport.HTTPSTransportConfig;
import org.wso2.msf4j.spring.transport.HTTPTransportConfig;

@Configuration
public class TransportConfiguration {

    @Bean
    public HTTPSTransportConfig https() {
        return new HTTPSTransportConfig().port(7070).keyStore("wso2carbon.jks")
                .keyStorePass("wso2carbon").certPass("wso2carbon").enabled();

    }

    @Bean
    public HTTPTransportConfig http() {
        return new HTTPTransportConfig().enabled(false);
    }

}
