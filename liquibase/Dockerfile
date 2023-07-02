FROM openjdk:11-slim
WORKDIR /

FROM maven:3.6.3-jdk-11-slim as build
COPY . /usr/src/app/
WORKDIR /usr/src/app/
RUN mvn clean install

cmd mvn liquibase:update