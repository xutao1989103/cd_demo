#
# DOCKER-VERSION    1.10.3
#
# Dockerizing HelloWorld: Dockerfile for building HelloWorld images
#
FROM       ci/tomcat:7.0.55
MAINTAINER xutao

ADD init /init

ENTRYPOINT ["/init", "/scripts/run"]
