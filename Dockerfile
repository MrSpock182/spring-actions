FROM amazoncorretto:17-alpine3.14-jdk
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]