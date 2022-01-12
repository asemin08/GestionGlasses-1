FROM openjdk:15-jdk-alpine

LABEL MAINTENER="Allan et Brice"

RUN apk update && \
    apk upgrade && \
    apk add git && \
    apk add maven && \
    apk add bash

RUN git clone -b devops https://github.com/brikema/GestionGlasses.git

WORKDIR GestionGlasses

RUN mvn clean package

RUN cp target/*.jar app.jar

RUN addgroup -S spring && adduser -S spring -G spring

USER spring:spring

ENTRYPOINT ["java","-jar","app.jar"]
