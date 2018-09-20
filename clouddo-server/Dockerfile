FROM openjdk:8

ADD clouddo-server/target/*.jar /opt/app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/opt/app.jar"]

EXPOSE 8761