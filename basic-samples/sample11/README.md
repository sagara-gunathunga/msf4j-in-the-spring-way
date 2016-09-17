# How to build and run the sample

## About this sample

This sample demonstrates how to configure MSF4J transport related properties using ListenerConfiguration beans.

```java
@Configuration
public class TransportConfig {

    @Bean
    public ListenerConfiguration http() {
        ListenerConfiguration listenerConfiguration =
                new ListenerConfiguration("netty", "0.0.0.0", 7070);
        listenerConfiguration.setEnableDisruptor(false);
        listenerConfiguration.setParameters(getDefaultTransportParams());
        return listenerConfiguration;
    }

    private List<Parameter> getDefaultTransportParams() {
        Parameter param1 = new Parameter();
        param1.setName(Constants.EXECUTOR_WORKER_POOL_SIZE);
        param1.setValue("1024");
        return Collections.singletonList(param1);
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
java -jar target/sample11-1.0.0.jar
```

## How to test the sample

We will use the cURL command line tool for testing. You can use your preferred HTTP or REST client too.

```
curl -v http://localhost:7070/hello/wso2
```

You should get a response similar to the following:

```
Hello wso2
```


