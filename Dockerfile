FROM openjdk:8-jdk-alpine
ADD target/sapient_wheather_report.jar sapient_wheather_report.jar
CMD ["java","-jar","/sapient_wheather_report.jar"]