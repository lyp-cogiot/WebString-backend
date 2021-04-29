FROM openjdk:8
MAINTAINER democlient
VOLUME /tmp
ADD target/WebString-backend.jar /WebString-backend.jar
EXPOSE 9100
ENTRYPOINT ["java","-jar","/WebString-backend.jar"]