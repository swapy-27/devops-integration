# Use an appropriate base image with Java and a suitable version for your Spring Boot application
FROM eclipse-temurin:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the compiled Spring Boot JAR into the container
COPY target/example_docker-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that your Spring Boot application listens on
EXPOSE 8080

# Command to run your application
CMD ["java", "-jar", "app.jar"]
