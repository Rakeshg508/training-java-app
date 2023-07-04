FROM openjdk:11-slim
#FROM --platform=linux/amd64 openjdk:11-slim
EXPOSE 8089
COPY target/app-service-2.7.13.jar app-service.jar 
ENTRYPOINT ["java","-jar","app-service.jar"]
