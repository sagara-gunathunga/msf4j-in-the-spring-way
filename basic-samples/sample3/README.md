# How to build and run the sample

## About this sample

This sample demonstrate how to use Spring XML configuration approach to develop a Spring based MSF4J service.

```java
@Configuration
@ImportResource("classpath:application-context.xml")
public class SpringConfiguration {

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
java -jar target/sample3-1.0.0.jar
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