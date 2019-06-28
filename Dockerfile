FROM openjdk:8-jdk-alpine
RUN mkdir docker-app1
COPY ./target/docker-learn-0.0.1-SNAPSHOT.jar docker-app1
CMD ["java","-jar docker-learn-0.0.1-SNAPSHOT.jar"]
