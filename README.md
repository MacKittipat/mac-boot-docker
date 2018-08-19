# mac-docker

Build a docker image
```
docker build -t mac-boot -f ./Dockerfile ./target
```
Set docker context to `./target`, `ADD ./mac-docker-1.0-SNAPSHOT.jar /app` will works in Dockerfile because `mac-docker-1.0-SNAPSHOT.jar` is in `./target`

Run a container in background
```
docker run -d -p 8080:8080 --name mac-boot mac-boot
```

View log
```
docker logs -f mac-boot
```
