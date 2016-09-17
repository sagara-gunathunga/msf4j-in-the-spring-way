# How to build and run the sample

## About this sample

This is a very basic HelloWorld sample based on MSf4J Spring. This sample demonstrates how to use Spring
 @Autowired annotation within a MSF4J resource class to achieve basic Dependency Injection (DI).

```java
@Component
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
java -jar target/sample1-1.0.0.jar
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