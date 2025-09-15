# revenant

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: <https://quarkus.io/>.

## Install


```shell script
./mvnw install
```

Run the tests

```shell script
./mvnw test
```

Run the application

```shell script
./mvnw quarkus:dev
```

Build container image

```shell script
./mvnw install -Dquarkus.container-image.build=true
```

or

```shell script
docker build -t daemon-revenant . -f ./src/main/docker/Dockerfile.jvm
```


Run the container

```shell script
docker run -p 8080:8080 --rm geohad/daemon-revenant:1.0.0-SNAPSHOT
```

or

```shell script
docker run -p 8080:8080 --rm daemon-revenant
```
