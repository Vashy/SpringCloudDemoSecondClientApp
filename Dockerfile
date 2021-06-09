FROM openjdk:17-jdk-alpine3.13

RUN mkdir /app

COPY build.gradle.kts gradlew gradlew.bat settings.gradle.kts /app/
COPY gradle/ /app/gradle/
COPY src/ /app/src/

EXPOSE 8891

ENTRYPOINT ["/app/gradlew", "-p", "/app/", "bootRun"]
