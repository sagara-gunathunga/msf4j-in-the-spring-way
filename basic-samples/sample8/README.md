# How to build and run the sample

## About this sample

This sample demonstrates how to use MSF4J ExceptionMapper concept using MSF4J Spring module.

```java
@Component
public class InvalidNameExceptionMapper implements ExceptionMapper<InvalidNameException> {
    @Override
    public Response toResponse(InvalidNameException exception) {
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(exception.getMessage()).build();
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
java -jar target/sample8-1.0.0.jar
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

Testing the exception case 

```
curl -v http://localhost:8080/hello/wso2
```

You should get a response similar to the following with HTTP 500:

```
123 is an invalid name

```

