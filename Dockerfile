FROM amazoncorretto:17-alpine3.14-jdk
WORKDIR /app
COPY target/actions-1.0.0.jar actions-1.0.0.jar
EXPOSE 8080
CMD ["java", "-jar", "actions-1.0.0.jar"]