# Build image
FROM maven:3.9.6-eclipse-temurin-17 AS build

# צור משתמש dev
RUN useradd -ms /bin/bash dev

WORKDIR /app

COPY pom.xml .
COPY src ./src

# תן ל-dev בעלות על קבצי העבודה
RUN chown -R dev:dev /app

USER dev

RUN mvn clean package -DskipTests

# Run image
FROM eclipse-temurin:17-jre

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

USER 1000:1000

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
