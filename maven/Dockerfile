#
# DOCKER-VERSION    1.10.3
#
# Dockerizing maven: Dockerfile for building maven images
#
FROM       ci/jdk:1.7.0
MAINTAINER  xutao

ENV MAVEN_VERSION 3.3.9
ENV MAVEN_HOME /opt/maven

# Install maven
#ADD http://mirror.cc.columbia.edu/pub/software/apache/maven/maven-3/${MAVEN_VERSION}/binaries/apache-maven-${MAVEN_VERSION}-bin.tar.gz /opt/

COPY apache-maven-3.3.9-bin.tar.gz /opt/

RUN tar xzf /opt/apache-maven-3.3.9-bin.tar.gz -C /opt && \
    mv /opt/apache-maven-${MAVEN_VERSION} /opt/maven  && \
    ln -s /opt/maven/bin/mvn /usr/bin/mvn

#COPY settings.xml /opt/maven/conf/settings.xml

ADD hello /hello
RUN cd /hello && \
    mvn clean install 