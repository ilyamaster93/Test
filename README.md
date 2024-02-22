<details>
<summary>Run all tests:</summary>

```shell
mvn clean test
```
</details>

<details>
<summary>Run tests from test class:</summary>

```shell
mvn clean test -Dtest=APITests 
```
</details>

<details>
<summary>Run a single test method from a test class:</summary>

```shell
mvn clean test -Dtest=APIReadTests#getUsersList
```
</details>

<details>
<summary>Run test suites:</summary>

```shell
mvn clean test -Dtest=TestSuiteCreateAndUpdate
```
</details>

<details>
<summary>To see report you have to:</summary>

- before execute docker-compose to launch `allure-service` and its `ui` change [${pwd}](docker-compose.yml) on your PATH to folder than start:
```shell
 docker-compose up -d allure allure-ui
```
- follow to [allure-ui](http://localhost:5252/allure-docker-service-ui/) to check reports
</details>