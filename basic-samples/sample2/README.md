# How to build and run the sample

## About this sample

This is a very basic HelloWorld sample based on MSf4J Spring. This sample demonstrates how to use Spring Java
Configuration class to define Spring beans instead of the  @Component annotation.

```java
@Configuration
public class SpringConfiguration {

    @Bean
    public Hello hello() {
        return new Hello();
    }

    @Bean
    public HelloService helloService() {
        return new HelloService();
    }
}
```


```java
@Path("/hello")
public class Hello {

    @Autowired
    private HelloService helloService;

    @GET
    @Path("/{name}")
    public String hello(@PathParam("name") String name) {
        return helloService.hello(name);
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
java -jar target/sample2-1.0.0.jar
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