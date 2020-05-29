FROM adoptopenjdk/openjdk8-openj9:alpine-slim

ENV CONSUL_LOCATION consul

EXPOSE 8090

RUN echo 'hosts: files mdns4_minimal [NOTFOUND=return] dns mdns4' >> /etc/nsswitch.conf

COPY target/app_v11.0.jar  /app_v11.0.jar

ENTRYPOINT ["java", "-jar", "/app_v11.0.jar"]
