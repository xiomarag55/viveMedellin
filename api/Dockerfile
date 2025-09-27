# Construction stage
FROM maven:3.8.6-openjdk-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# pdxn
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the JAR from the build stage
COPY --from=builder /app/target/eventos-0.0.1-SNAPSHOT.jar app.jar

# Create a non-root user for security reasons
RUN useradd -m myapp
USER myapp

# Expose port
EXPOSE 8080

# Start command
ENTRYPOINT ["java", "-jar", "app.jar"]