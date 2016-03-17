#
# DOCKER-VERSION    1.10.3
#
# Dockerizing jre: Dockerfile for building jre images
#
FROM       ci/centos:7.1.1503
MAINTAINER  xutao

ENV JAVA_VERSION 1.7.0
ENV JRE_HOME /usr/lib/jvm/jre

# Install jre
RUN yum -y install java-${JAVA_VERSION}-openjdk mysql && \
    yum clean all