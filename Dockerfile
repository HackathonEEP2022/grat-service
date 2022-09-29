FROM openjdk:latest
ADD target/EEP32_GRAT-1.0-SNAPSHOT.jar grat-service.jar
#COPY ${JAR_FILE} grat-service.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "grat-service.jar"]