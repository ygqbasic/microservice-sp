FROM openjdk:8

ADD target/clouddo-server-0.0.1.jar /opt/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/app.jar"]

EXPOSE 8761