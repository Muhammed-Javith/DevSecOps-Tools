FROM openjdk:17

COPY target/DockerHomeController.jar /usr/app/DockerHomeController.jar

WORKDIR /usr/app

ENTRYPOINT ["java","-jar","DockerHomeController.jar"]
