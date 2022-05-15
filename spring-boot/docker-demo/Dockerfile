FROM openjdk:8
ADD ./target/*.jar /usr/src/my-sample-app.jar
WORKDIR usr/src
ENTRYPOINT ["java","-jar", "my-sample-app.jar"]