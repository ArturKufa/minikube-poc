FROM openjdk:11.0.5-stretch
ADD /build/libs/app-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD java -jar app-0.0.1-SNAPSHOT.jar