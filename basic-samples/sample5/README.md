# How to build and run the sample

## About this sample

This sample demonstrates how to add and configure an in-built MSF4J Interceptor using Spring.

```java
@Configuration
public class SpringConfiguration {

    @Bean
    public MetricsInterceptor metricsInterceptor() {
        MetricsInterceptor metricsInterceptor = new MetricsInterceptor();
        return metricsInterceptor;
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
java -jar target/sample5-1.0.0.jar
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