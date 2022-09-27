FROM openjdk:17
ADD target/demo-for-customer-data-0.0.1-SNAPSHOT.jar demo-for-customer-data.jar
ENTRYPOINT ["java","-jar","demo-for-customer-data.jar"]
