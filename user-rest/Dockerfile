# שלב build
FROM maven:3.9.6-eclipse-temurin-17 AS build

# צור משתמש dev
RUN useradd -ms /bin/bash dev

WORKDIR /app

# העתק את כל הפרויקט (כולל ה-parent POM והמודולים)
COPY ../../ .   # <-- חשוב להריץ docker build מה-root (user-service)

# תן ל-dev בעלות על הקבצים
RUN chown -R dev:dev /app

USER dev

# בנה את כל המודולים
RUN mvn clean package -DskipTests

# שלב הרצה
FROM eclipse-temurin:17-jre

WORKDIR /app

# העתק רק את ה-jar של user-rest מהשלב הקודם
COPY --from=build /app/user-rest/target/*.jar app.jar

USER 1000:1000

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
