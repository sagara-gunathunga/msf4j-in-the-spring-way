package org.wso2.msf4j.samples.spring.sample5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.msf4j.analytics.metrics.MetricsInterceptor;

@Configuration
public class SpringConfiguration {

    @Bean
    public MetricsInterceptor metricsInterceptor() {
        MetricsInterceptor metricsInterceptor = new MetricsInterceptor();
        return metricsInterceptor;
    }

}
