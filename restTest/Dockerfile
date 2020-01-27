FROM frolvlad/alpine-java:jdk8-slim AS builder
ADD ["target/ms-fc-apigateway-0.0.1-SNAPSHOT.jar", "app.jar"]
EXPOSE 8080 8080
ENV JAVA_OPTS="-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8081,suspend=n"
RUN sh -c 'touch /app.jar'
ENTRYPOINT [ "sh", "-c", "java -jar /app.jar" ]
