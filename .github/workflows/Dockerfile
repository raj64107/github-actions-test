FROM openjdk:11-jre-slim-buster

RUN apt-get update && apt-get install -y wget && rm -rf /var/lib/apt/lists/*

RUN groupadd --gid 1100 "stratosphere" && \
useradd --create-home --no-log-init --shell "/bin/bash" --uid 1100 --gid 1100 "stratosphere"

ENV JAVA_HOME /usr/local/openjdk-11

USER 1100

ARG RELEASE_VERSION=*
WORKDIR /home/stratosphere
ARG JAR_FILE=build/libs/hello-world-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

CMD java $JAVA_ARGS -jar  ./app.jar