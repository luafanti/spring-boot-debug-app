ARG BUILD_IMAGE=eclipse-temurin:17-jdk-alpine
ARG RUNTIME_IMAGE=eclipse-temurin:17-jre-alpine

FROM $BUILD_IMAGE AS builder
COPY . /app
WORKDIR /app
RUN chmod +x infra/docker/build.sh
RUN infra/docker/build.sh

FROM $RUNTIME_IMAGE AS runtime
COPY --from=builder /app/app.jar /app/app.jar
WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]


