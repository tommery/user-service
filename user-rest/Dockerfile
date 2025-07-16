# Build stage
FROM maven:3.9.6-eclipse-temurin-17 AS build

RUN useradd -ms /bin/bash dev

WORKDIR /app

# נבנה מהשורש של user-service, לכן משתמשים ב-COPY . .
COPY . .

RUN chown -R dev:dev /app

USER dev

RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/user-rest/target/*.jar app.jar

USER 1000:1000

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
