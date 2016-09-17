# How to build and run the sample

## About this sample

This sample demonstrates how to configure MSF4J framework to enable HTTPS transport and disable HTTP transport.

```java
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

```

## How to build the sample

From this directory, run

```
mvn clean install
```

## How to run the sample

From the target directory, run
```
java -jar target/sample10-1.0.0.jar
```

## How to test the sample

We will use the cURL command line tool for testing. You can use your preferred HTTP or REST client too.

```
curl -v -k https://localhost:7070/hello/wso2
```

You should get a response similar to the following:

```
Hello wso2
```