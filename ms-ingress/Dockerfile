FROM alpine:3.14
RUN apk add --no-cache openjdk11
COPY build/libs/ms-ingress-0.0.1-SNAPSHOT.jar /app/
CMD java -jar /app/ms-ingress-0.0.1-SNAPSHOT.jar
