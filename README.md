# Spring Native Demo

This is a test with the new Spring Native, using Spring Web and MongoDB.

## Running

To run should execute one of the following commands:

- **make build**: Compile and generate the image.
- **make run**: Execute compose to start the application (Need to run build command before).
- **make stop**: Stop the execution, removing all containers.
- **make logs**: Show container application logs.
- **make run-with-build**: Execute the build and run.
- **make run-with-logs**: The same as run-with-build, but with logs.

If you do not have make installed you can execute the following commands to compile and execute.

- Build:
  ```sh
  $ ./mvnw clean spring-boot:build-image -DskipTests
  ```
- Run:
  ```sh
  $ docker-compose up -d
  ```

**Notice:** You should have docker and docker-compose installed

## Calling endpoints

- List users
  ```sh
  $ curl --location --request GET 'http://localhost:8080/users'
  ```

- Create a user
  ```sh
  $ curl --location --request POST 'http://localhost:8080/users' \
  --header 'Content-Type: application/json' \
  --data-raw '{
  "name": "Fulano de Tal",
  "age": 25
  }'
  ```

## Configurations

To reach the correct execution I needed to did some configurations.
> I added **--enable-all-security-services** argument, because the spring data MongoDB need some security services to run.

> I added a type hint for **HttpStatus** because the application was not finding the class and I added the hint to the compile include that class during the compilation.

For more details about Spring Native access [here](https://docs.spring.io/spring-native/docs/current/reference/htmlsingle/)