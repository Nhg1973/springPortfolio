FROM amazoncorretto:11-alpine-jdk
VOLUME [ "/tmp" ]
EXPOSE 8080
ADD ./target/crud-0.0.1-SNAPSHOP.jar crud-0.0.1-SNAPSHOP.jar
ENTRYPOINT ["java","-jar","/crud-0.0.1-SNAPSHOP.jar"]

