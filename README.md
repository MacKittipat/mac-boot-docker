# mac-docker

Build spring boot app
```
mvn clean install
```

Build a docker image
```
docker build -t mac-boot .
```

Run a container in background
```
docker run -d -p 8080:8080 --name mac-boot mac-boot
```

View log
```
docker logs -f mac-boot
```


java -Djarmode=layertools -jar .\target\mac-docker-1.0-SNAPSHOT.jar extract
