# How to build and run the sample

## How to build the sample

From this directory, run

```
mvn clean install
```

## How to run the sample

From the target directory, run
```
java -jar target/jpa-book-catalog-1.0.0.jar
```

## How to test the sample

We will use the cURL command line tool for testing. You can use your preferred HTTP or REST client too.


1.) Adding two new book to the catalog 

``` 
curl -v -H "Content-Type: application/json" -X POST -d '{"name":"Java","author":"SUN"}' http://localhost:8080/catalog
```

```
curl -v -H "Content-Type: application/json" -X POST -d '{"name":"Java","author":"WSO2"}' http://localhost:8080/catalog
```

You should able to see following output. 

```
 HTTP/1.1 201 Created
```


2.) Get details of a book by providing the book id. 

```
curl -v  -X GET  http://localhost:8080/catalog/1
```
You should able to see following output.

```
{"id":1,"name":"Java","author":"SUN"}
```


3.) Delete a book 

```
curl -v  -X DELETE  http://localhost:8080/catalog/1
```

You should able to see following output.
``` 
 HTTP/1.1 202 Accepted
``` 

4.) Try to get the details of non-existing book

``` 
curl -v  -X GET  http://localhost:8080/catalog/1
 ```
 
 You should able to see following output.
 
```  
 HTTP/1.1 404 Not Found
 Specific book does not exists
 ``` 