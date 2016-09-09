package org.wso2.msf4j.samples.spring.sample11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.carbon.transport.http.netty.common.Constants;
import org.wso2.carbon.transport.http.netty.config.ListenerConfiguration;
import org.wso2.carbon.transport.http.netty.config.Parameter;

import java.util.Collections;
import java.util.List;

@Configuration
public class TransportConfig {

    @Bean
    public ListenerConfiguration http() {
        ListenerConfiguration listenerConfiguration =
                new ListenerConfiguration("netty", "0.0.0.0", 7070);
        listenerConfiguration.setEnableDisruptor(false);
        listenerConfiguration.setParameters(getDefaultTransportParams());
        return listenerConfiguration;
    }

    private List<Parameter> getDefaultTransportParams() {
        Parameter param1 = new Parameter();
        param1.setName(Constants.EXECUTOR_WORKER_POOL_SIZE);
        param1.setValue("1024");
        return Collections.singletonList(param1);
    }
}
