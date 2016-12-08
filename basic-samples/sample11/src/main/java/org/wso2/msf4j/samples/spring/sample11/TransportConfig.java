/*
*  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
*  Unless required by applicable law or agreed to in writing,
*  software distributed under the License is distributed on an
*  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
*  KIND, either express or implied.  See the License for the
*  specific language governing permissions and limitations
*  under the License.
*/
package org.wso2.msf4j.samples.spring.sample11;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.wso2.carbon.transport.http.netty.common.Constants;
import org.wso2.carbon.transport.http.netty.config.ListenerConfiguration;
import org.wso2.carbon.transport.http.netty.config.Parameter;
import org.wso2.carbon.transport.http.netty.listener.NettyListener;

import java.util.Collections;
import java.util.List;

@Configuration
public class TransportConfig {

//   TODO - Fix this
//    @Bean
//    public ListenerConfiguration http() {
//
//        ListenerConfiguration listenerConfiguration =
//                new ListenerConfiguration("netty", "0.0.0.0", 7070);
//        NettyListener listener = new NettyListener(listenerConfiguration);
//        return listenerConfiguration;
//    }

//    private List<Parameter> getDefaultTransportParams() {
//        Parameter param1 = new Parameter();
//        param1.setName(Constants.EXECUTOR_WORKER_POOL_SIZE);
//        param1.setValue("1024");
//        return Collections.singletonList(param1);
//    }
}
