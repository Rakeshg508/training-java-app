FROM maven:3.6.3-jdk-11-slim as build
COPY . /usr/src/app/
WORKDIR /usr/src/app/
RUN mvn -f /usr/src/app/pom.xml package -Dmaven.test.skip=false

FROM openjdk:11-slim
WORKDIR /
#COPY --from=build /usr/src/app/app-service/target/app-service*.jar /app-service.jar
CMD java -jar app-service-2.7.13.jar