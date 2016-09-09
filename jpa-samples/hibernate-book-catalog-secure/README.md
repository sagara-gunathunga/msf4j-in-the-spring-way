# How to build and run the sample

## How to build the sample

From this directory, run

```
mvn clean install
```

## How to run the sample

From the target directory, run
```
java -jar target/hibernate-book-catalog-secure-1.0.0.jar
```

## How to test the sample

We will use the cURL command line tool for testing. You can use your preferred HTTP or REST client too.


1.)Adding two new book to the catalog 

``` 
curl -v -k -u user:user -H "Content-Type: application/json" -X POST -d '{"name":"Java","author":"SUN"}' https://localhost:8443/catalog
```

```
curl -v -k -u user:user -H "Content-Type: application/json" -X POST -d '{"name":"Java","author":"WSO2"}' https://localhost:8443/catalog
```

You should able to see following output. 

```
 HTTP/1.1 201 Created
```

2.) Get details of a book by providing the book id. 

```
curl -v -k -X GET -u user:user https://localhost:8443/catalog/1
```
You should able to see following output.

```
{"id":1,"name":"Java","author":"SUN"}
```

3.) Delete a book 

```
curl -v -k -X DELETE -u user:user https://localhost:8443/catalog/1
```

You should able to see following output.
``` 
 HTTP/1.1 202 Accepted
``` 

Try to get the details of non-existing book

``` 
curl -v -k -X GET  -u user:user https://localhost:8443/catalog/1
 ```
 
 4.) You should able to see following output.
 
```  
 HTTP/1.1 404 Not Found
 Specific book does not exists
 ``` 