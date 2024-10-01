FROM openjdk
ARG JAR_FILE=target/*.jar
COPY target/BookDemo-0.0.1-SNAPSHOT.jar BookDemo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/BookDemo-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080




