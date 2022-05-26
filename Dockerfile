# define base docker image 
FROM openjdk:17

COPY target/API-Reader-0.0.1-SNAPSHOT.jar api-reader.jar

ENTRYPOINT [ "java", "-jar", "api-reader.jar" ]