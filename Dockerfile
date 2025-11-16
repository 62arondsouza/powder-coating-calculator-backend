# Stage 1: Build (JDK needed for compile)
FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests -Pproduction

# Stage 2: Run (JRE only — 70% smaller)
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

# Copy only JAR
COPY --from=build /app/target/*.jar app.jar

# Optimize JVM for low memory
ENV JAVA_OPTS="-XX:+UseSerialGC -Xss512k -XX:MaxRAMPercentage=75.0"

# Expose port
EXPOSE 8080

# Run
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
