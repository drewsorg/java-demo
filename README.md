# Java Demo

A simple Java starter project with a "Hello World" application.

## Description

This is a basic Java project that demonstrates a simple Maven-based application with:
- A `HelloWorld` class that prints "Hello world"
- Unit tests using JUnit 5
- GitHub Actions workflow for CI/CD

## Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

## Building the Project

```bash
mvn clean package
```

## Running the Application

```bash
java -jar target/demo-1.0-SNAPSHOT.jar
```

Or directly with Maven:
```bash
mvn exec:java -Dexec.mainClass="com.example.demo.HelloWorld"
```

## Running Tests

```bash
mvn test
```

## Project Structure

```
.
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── example
│   │               └── demo
│   │                   └── HelloWorld.java
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── demo
│                       └── HelloWorldTest.java
├── .github
│   └── workflows
│       └── build.yml
├── pom.xml
└── README.md
```

## CI/CD

This project uses GitHub Actions for continuous integration. The workflow:
- Builds the project
- Runs all tests
- Executes the application

The workflow is triggered on pushes and pull requests to the main/master branch.