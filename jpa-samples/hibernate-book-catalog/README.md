
curl -v -H "Content-Type: application/json" -X POST -d '{"name":"Java","author":"SUN"}' http://localhost:8080/catalog
curl -v -H "Content-Type: application/json" -X POST -d '{"name":"Java","author":"IBM"}' http://localhost:8080/catalog
curl -v  -X GET  http://localhost:8080/catalog/1
curl -v  -X GET  http://localhost:8080/catalog/2
curl -v  -X DELETE  http://localhost:8080/catalog/1