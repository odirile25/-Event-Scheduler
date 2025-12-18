FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY pom.xml .
COPY ./src .

RUN mvn -B package - DskipTests

FROM eclipse-temurin:21-jre
WORKDIR /app

COPY pom.xml .
COPY ./src .
CMD ["jar", "jar", "app-jar"]

