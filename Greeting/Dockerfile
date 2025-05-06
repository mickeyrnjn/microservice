# Use an OpenJDK base image
FROM container-registry.oracle.com/java/openjdk:19

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file into the container Image
COPY target/Greeting-0.0.1-SNAPSHOT.jar Greeting.jar

# Expose the application port
EXPOSE 9090

# Run the application
ENTRYPOINT ["java", "-jar", "Greeting.jar"]