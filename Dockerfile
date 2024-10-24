# Use a Java base image (e.g., OpenJDK 17)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container (adjust the path as needed)
COPY target/SpringDataRest-0.0.1-SNAPSHOT.jar app.jar
# Expose the port that your Spring Boot app runs on
EXPOSE 8080

# Command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "app.jar"]
