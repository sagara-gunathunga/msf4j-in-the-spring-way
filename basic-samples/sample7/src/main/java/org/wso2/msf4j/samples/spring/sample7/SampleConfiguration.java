package org.wso2.msf4j.samples.spring.sample7;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfiguration {

    @Bean
    public HeaderLogInterceptor headerLogInterceptor() {
        HeaderLogInterceptor headerLogInterceptor = new HeaderLogInterceptor();
        return headerLogInterceptor;
    }
}
