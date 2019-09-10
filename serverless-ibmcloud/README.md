# Serverless example

That's an example of how to create function as a service using Serverless Framework and IBM Cloud Functions.
To use with another provider is simples. It's just do some changes in your function contract and on the serverless.yml.

## Endpoint

Here is an example of the endpoint created by this example:
```
https://6454a6e5.us-south.apiconnect.appdomain.cloud/github/repositories?user=epiresdasilva
```

## Deploy

To deploy this function over the IBM Cloud Functions you just need to do:

```
mvn clean package
```

and

```
serverless deploy
```

We assumed you have configured Maven, Serverless Framework and the IBM Cloud CLI.