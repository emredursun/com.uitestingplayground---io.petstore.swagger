# Test Automation [WEB & API]

##### API and UI Automation Testing Using Java, cucumber and restAssured

### Environment and specs:
- [petstore](https://petstore.swagger.io/)
- [uitestingplayground](http://www.uitestingplayground.com/)

### dependencies:
- [cucumber-java v7.11.0](https://mvnrepository.com/artifact/io.cucumber/cucumber-java)
- [cucumber-junit v7.11.0](https://mvnrepository.com/artifact/io.cucumber/cucumber-junit)
- [rest-assured v5.3.0](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)
- [hamcrest v2.2](https://mvnrepository.com/artifact/org.hamcrest/hamcrest)
- [assertj v3.24.2](https://mvnrepository.com/artifact/org.assertj/assertj-core)
- [jackson v2.14.1](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)
- [lombok v1.18.24](https://mvnrepository.com/artifact/org.projectlombok/lombok)

### plugins:
- [maven-failsafe-plugin v3.0.0-M8](https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-failsafe-plugin)

### Setting Up
These instructions will get you a copy of the project up and running on your local machine.

- *clone the repo:*
```shell
git clone https://gitlab.com/info.emredursun/com.uitestingplayground
```
- *set project sdk as 19*

Running tests from terminal:
```shell
mvn -B verify --file pom.xml
```
Running tests in CI/CD pipeline:
- In this project I used gitlab CI.

### About scenarios:
<b>Automated scenarios are:</b>
#### API
- Post request for pet endpoint
- Post request for Store Order
- Post request for user
#### UI
- Testing that the initial button color is changed
- Testing that ID is not used for button identification
- Testing that there is an element with 'Welcome' text

What's next?
- Negative scenarios should be added for both API and UI Tests.
- We can foresee some failures with negative scenarios.
- GET and UPDATE requests should be added.
- Additional test cases can be added to the project for UI Testing.