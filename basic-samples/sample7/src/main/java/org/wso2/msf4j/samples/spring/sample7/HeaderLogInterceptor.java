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
package org.wso2.msf4j.samples.spring.sample7;

import org.wso2.carbon.messaging.Header;
import org.wso2.msf4j.Interceptor;
import org.wso2.msf4j.Request;
import org.wso2.msf4j.Response;
import org.wso2.msf4j.ServiceMethodInfo;

public class HeaderLogInterceptor implements Interceptor {
    @Override
    public boolean preCall(Request request, Response response, ServiceMethodInfo serviceMethodInfo) throws Exception {
        for (Header header : request.getHeaders().getAll()) {
            System.out.println("Header Name: " + header.getName() + " value : " + header.getValue());
        }
        return true;
    }

    @Override
    public void postCall(Request request, int i, ServiceMethodInfo serviceMethodInfo) throws Exception {
    }
}
