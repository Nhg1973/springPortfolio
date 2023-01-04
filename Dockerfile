FROM amazoncorretto:11-alpine-jdk

COPY ./target/tutorial_jwt_BACK.jar tutorial_jwt_BACK.jar

ENTRYPOINT ["java","-jar","/tutorial_jwt_BACK.jar"]

