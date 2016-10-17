# How to build and run the sample

## About this sample

This sample demonstrates how to configure MSF4J transport related properties using Spring Java configuration,
the service will be run on port 6060 instead of default 8080 port.

```java
@Configuration
public class TransportConfiguration {

    @Bean
    public HTTPTransportConfig http() {
        return new HTTPTransportConfig(6060);
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
java -jar target/sample9-1.0.0.jar
```

## How to test the sample

We will use the cURL command line tool for testing. You can use your preferred HTTP or REST client too.

```
curl -v http://localhost:6060/hello/wso2
```

You should get a response similar to the following:

```
Hello wso2
```

## How to use Spring profiles

dev profile - java -Dspring.profiles.active=dev -jar target/sample9-1.0.0.jar

prod profile - java -Dspring.profiles.active=prod -jar target/sample9-1.0.0.jar