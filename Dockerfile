# Use OpenJDK 8 with Alpine Linux for a lightweight image
FROM openjdk:8-alpine

# Update package manager and install bash (if required)
RUN apk update && apk add bash

# Create directory for the application
RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app

# Set MongoDB URI (ensure it's correct and ideally not hardcoded for production)
ENV MONGODB_URI="mongodb+srv://denifer:admin123@mongodb-demo.p1jch.mongodb.net/prospers_llc?retryWrites=true&w=majority&appName=mongodb-demo"

# Copy the Spring Boot jar file into the container
COPY target/spring-boot-mongo-1.0.jar $PROJECT_HOME/spring-boot-mongo.jar

# Set the working directory
WORKDIR $PROJECT_HOME

# Expose port 8080 (default for Spring Boot)
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "./spring-boot-mongo.jar"]
