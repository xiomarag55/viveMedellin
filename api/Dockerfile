# Construction stage
FROM maven:3.9.9-eclipse-temurin-17 AS builder
WORKDIR /app

# Copy pom.xml to cache dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code
COPY src ./src

# Compile and package
RUN mvn clean package -DskipTests

# Runtime stage
FROM eclipse-temurin:17-jdk-jammy
WORKDIR /app

# Copy the JAR generated in the build
COPY --from=builder /app/target/eventos-0.0.1-SNAPSHOT.jar app.jar

# Create a non-root user
RUN useradd -m myapp
USER myapp

# Expose the port
EXPOSE 8080

# Start command
ENTRYPOINT ["java", "-jar", "app.jar"]
