# Start with a base image containing Java runtime
FROM openjdk:21-oracle

# The application's jar file
ARG JAR_FILE=target/*.jar

# Add the application's jar to the container
COPY ./build/libs/smartfin-backend-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java","-jar","/app.jar"]
