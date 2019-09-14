# Spring Boot example

That is an example using Spring Boot and GoApiGo to build an scraper that returns all GitHub repositories from an user.

Request:
```
$ curl -X GET http://localhost:8080/api/github/repositories?user=epiresdasilva
```
Response:
```
{"repositories":[{"name":"spring-cloud-contract","description":"Consumer Driven Contracts in Spring","numberOfForks":1},{"name":"number-in-words-quarkus","description":null,"numberOfForks":4},null,{"name":"debit-authorizer","description":"Example of a debit authorizer using functions","numberOfForks":7},{"name":"clipper-function","description":"Native serverless function on IBM Cloud Functions","numberOfForks":null},{"name":"olivia-challenge","description":"Desafio para adivinhar os atributos que a Olivia, minha filha, vai nascer. Projeto utilizando serverless.","numberOfForks":null},{"name":"number-in-words-function","description":"Number in words functions in Java and Python for benchmarking - FaaS","numberOfForks":null},{"name":"workshop-faas","description":null,"numberOfForks":null},null,{"name":"java-faas-ibm-cloud-example","description":"Example of FaaS using Java and Cloudant on IBM Bluemix","numberOfForks":2},{"name":"bitcoin-intro-slides","description":"Bitcoin intro","numberOfForks":3},{"name":"meetup-hql","description":"Projeto para exemplificar funcionamento do HQL","numberOfForks":null},{"name":"quartz-dynamic-pool","description":"Provide a Quartz Thread Pool implementation to do dynamic resizing of the thread pool size of execution","numberOfForks":2},{"name":"nfe","description":"Nota Fiscal Eletrônica em Java","numberOfForks":279},null,{"name":"efinanceira","description":"Projeto em Java para assinar o XML da e-Financeira","numberOfForks":1},{"name":"cte-multi-table-bulk-id-stategy","description":"Bulk Id Strategy for Hibernate using CTE instead of Temporary Table","numberOfForks":8},null,{"name":"datasource-metric-modcluster","description":"Datasource Metric for Modcluster (AS7/EAP6)","numberOfForks":1}]}
```