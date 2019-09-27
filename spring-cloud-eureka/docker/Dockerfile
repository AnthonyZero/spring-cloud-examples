FROM java:8

VOLUME /tmp

ADD spring-cloud-eureka-0.0.1-SNAPSHOT.jar /app.jar

EXPOSE 86

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]