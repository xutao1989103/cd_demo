#
# DOCKER-VERSION    1.10.3
#
# Dockerizing jdk: Dockerfile for building jdk images
#
FROM       ci/centos:7.1.1503
MAINTAINER  xutao

ENV JAVA_VERSION 1.7.0
ENV JDK_HOME /usr/lib/jvm/java-1.7.0-openjdk

# Install jdk
RUN yum -y install java-${JAVA_VERSION}-openjdk java-${JAVA_VERSION}-openjdk-devel && \
    yum clean all