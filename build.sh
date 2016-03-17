#!/bin/bash

docker build -t ci/maven:3.3.9 ${WORKSPACE}/maven
if docker ps -a | grep -i maven; then
	docker rm -f maven
fi
docker create --name maven ci/maven:3.3.9
docker cp maven:/hello/target/hello.war ${WORKSPACE}/hello
docker build -t localhost:5000/ci/hello:1.0.0 ${WORKSPACE}/hello
