# How to build and run the sample

## How to build the sample

From this directory, run

```
mvn clean install
```

## How to run the sample

From the target directory, run
```
java -jar target/sample6-1.0.0.jar
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
Additionally use can see following HTTP headers printed on server console.
 
```
 Header Name: Accept value : */*
 Header Name: User-Agent value : curl/7.43.0
 Header Name: Host value : localhost:8080
```