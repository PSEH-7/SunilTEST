FROM openjdk:8-jdk-alpine
ADD target/sapient_wheather_report-0.0.1-SNAPSHOT.jar.jar sapient_wheather_report-0.0.1-SNAPSHOT.jar.jar
CMD ["java","-jar","/sapient_wheather_report-0.0.1-SNAPSHOT.jar.jar"]
