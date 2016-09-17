# How to build and run the sample

## About this sample

This sample demonstrates how to use Spring bean lifecycle annotations such as  @PostConstruct or
@PreDestroy with a MSF4J service.

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

    @PostConstruct
    public void init()
    {
        System.out.println("Method init() invoked...");
    }

    @PreDestroy
    public void destroy()
    {
        System.out.println("Method destroy() invoked...");
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
java -jar target/sample4-1.0.0.jar
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