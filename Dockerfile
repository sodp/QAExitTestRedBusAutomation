FROM openjdk:8
EXPOSE 9090
ADD target/ExitTest.jar ExitTest.jar
ENTRYPOINT ["java","-jar","/ExitTest.jar"]