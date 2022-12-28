#!/bin/sh

set -e

./gradlew --no-daemon --info bootJar --exclude-task test
mv $(./gradlew --no-daemon --quiet bootJarPath) app.jar
