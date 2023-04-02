# mac-docker

Build spring boot app
```
mvn clean install
```

Extract Jar
```
cd target/
java -Djarmode=layertools -jar .\mac-docker-1.0-SNAPSHOT.jar extract
```

Build a docker image
```
docker build -t mac-boot:latest .
```

Run a container in background
```
docker run -d -p 8080:8080 --name mac-boot mac-boot
```

View log
```
docker logs -f mac-boot
```

Endpoint 
```
http://localhost:8080/
http://localhost:8080/hello
http://localhost:8080/api/mac
http://localhost:8080/api/mac/java
```
