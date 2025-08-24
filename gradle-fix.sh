#!/bin/bash
# Helper script to run Gradle with correct JAVA_HOME
export JAVA_HOME=/media/ali-naga-saputra/System/Linux/android-studio-2025.1.2.12-linux/android-studio/jbr
./gradlew "$@"
