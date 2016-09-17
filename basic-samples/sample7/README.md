# How to build and run the sample

## About this sample

This sample demonstrates how to develop a custom MSF4J Interceptor and enable it with a service using Spring
Java Configuration approach.

```java
public class HeaderLogInterceptor implements Interceptor {
    @Override
    public boolean preCall(Request request, Response response, ServiceMethodInfo serviceMethodInfo) throws Exception {
        Iterator<Map.Entry<String, String>> itr = request.getHeaders().entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entry = itr.next();
            System.out.println("Header Name: " + entry.getKey() + " value : " + entry.getValue());

        }
        return true;
    }

    @Override
    public void postCall(Request request, int i, ServiceMethodInfo serviceMethodInfo) throws Exception {
    }
}

```

```java
@Configuration
public class SampleConfiguration {

    @Bean
    public HeaderLogInterceptor headerLogInterceptor() {
        HeaderLogInterceptor headerLogInterceptor = new HeaderLogInterceptor();
        return headerLogInterceptor;
    }
}

```

## How to build the sample

From this directory, run

```
mvn clean install
```

## How to run the sample

From the target directory, run
```
java -jar target/sample7-1.0.0.jar
```

## How to test the sample

We will use the cURL command line tool for testing. You can use your preferred HTTP or REST client too.

```
curl -v http://localhost:8080/hello/wso2
```

You should get a response similar to the following:

```
Hello wso2
```

Additionally use can see following HTTP headers printed on server console
 
```
 Header Name: Accept value : */*
 Header Name: User-Agent value : curl/7.43.0
 Header Name: Host value : localhost:8080
```

