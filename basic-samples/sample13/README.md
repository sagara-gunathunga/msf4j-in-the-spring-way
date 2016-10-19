# How to build and run the sample

## About this sample

This sample demonstrates how to use Spring profile specific properties files.

```java
@Configuration
@PropertySources({
        @PropertySource(value = "file:application-${spring.profiles.active}.properties", ignoreResourceNotFound = true,
                name = "applicationProperties"),
        @PropertySource(value = "classpath:application-${spring.profiles.active}.properties", ignoreResourceNotFound = true,
                name = "applicationProperties"),}
)
public class TransportConfiguration {
}

```

## How to build the sample

From this directory, run

```
mvn clean install
```

## How to test the sample

From the target directory, run following command without specifying any Spring profile. This will load and apply
properties from default application.properties file. In this case service will start on 9090 port. 

```
java -jar target/sample13-1.0.0.jar
```

From the target directory, run following command  specifying 'dev' as the Spring profile. This will load and apply
properties from  application-dev.properties file. In this case service will start on 7072 port.

```
java -Dspring.profiles.active=dev -jar target/sample13-1.0.0.jar

```

From the target directory, run following command  specifying 'prod' as the Spring profile. This will load and apply
properties from default application-prod.properties file. In this case service will start on 6062 port.

```
java -Dspring.profiles.active=prod -jar target/sample13-1.0.0.jar
```
