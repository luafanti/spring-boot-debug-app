FROM adoptopenjdk/openjdk11:jdk-11.0.10_9-alpine-slim AS builder
COPY . /app
WORKDIR /app
RUN chmod +x infra/docker/build.sh
RUN infra/docker/build.sh

FROM adoptopenjdk/openjdk11:jre-11.0.10_9 AS runtime
COPY --from=builder /app/app.jar /app/app.jar
WORKDIR /app
EXPOSE 8088
ENTRYPOINT ["java", "-jar", "app.jar"]


