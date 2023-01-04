FROM amazoncorretto:11-alpine-jdk

COPY ./target/crud-0.0.1-SNAPSHOP.jar crud-0.0.1-SNAPSHOP.jar

ENTRYPOINT ["java","-jar","/crud-0.0.1-SNAPSHOP.jar"]
