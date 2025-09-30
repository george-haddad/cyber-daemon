# Mancubus

This project uses Vert.x

## Build

Set up your environment variables

```shell script
export MANCUBUS_VULN_HOST=vulnerability.circl.lu
export MANCUBUS_VULN_APIKEY=<get your own api key>
```

Compile, test and package the application

```shell script
./mvnw package
```

Run the tests

```shell script
./mvnw test
```

Run the application

```shell script
./mvnw clean compile exec:java
```
