SHELL := /bin/bash

build:
	./mvnw clean spring-boot:build-image -DskipTests

run:
	docker-compose up -d

stop:
	docker-compose down

logs:
	docker container logs -f demo-spring-native

run-with-build: build

run-with-logs: run logs