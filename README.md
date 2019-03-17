# mac-docker

Build a docker image
```
docker build -t mac-boot
```

Run a container in background
```
docker run -d -p 8080:8080 --name mac-boot mac-boot
```

View log
```
docker logs -f mac-boot
```
