FROM openjdk:11.0.5-stretch
ADD /build/libs/app-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
ENTRYPOINT ["sh", "-c", "java -jar app-0.0.1-SNAPSHOT.jar ${0} ${@}"]
