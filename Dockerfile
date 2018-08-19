FROM openjdk:8

WORKDIR /app

ADD target/mac-docker-1.0-SNAPSHOT.jar /app

EXPOSE 8080

CMD ["java", "-jar", "mac-docker-1.0-SNAPSHOT.jar"]