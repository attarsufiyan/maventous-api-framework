Maventous API Automation Framework
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

📘 Project Overview

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

* The Maventous API Automation Framework is a robust and scalable API testing framework built using Java, Rest Assured, TestNG, and Cucumber (BDD).

* It is designed to automate REST API testing using a Behavior Driven Development approach, ensuring that test scenarios are written in human-readable Gherkin language.

* The framework enables easy maintenance, data-driven testing, modular structure, and detailed reporting with both HTML and JSON outputs.

* It can be easily integrated into CI/CD pipelines and executed using Docker for seamless automation across environments.

![WhatsApp Image 2025-11-05 at 18 00 14_c4605f2d](https://github.com/user-attachments/assets/3adfcbd2-80c5-44ee-8ef6-b0a3ac9d432b)

------------------------------------------------------------------------------------------------------------------------------------------------------------------------

⚙️ Key Features
-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

* Supports BDD (Behavior Driven Development) with Cucumber.

* Handles token-based authentication using Rest Assured and Java.

* Generates HTML and JSON reports for test execution.

* Provides reusable utility classes for API endpoints, payloads, and validation.

* Fully Maven-managed project for dependency and build management.

* Integrated with Docker for environment-independent test execution.

* Compatible with CI/CD pipelines (Jenkins or GitHub Actions).

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🧰 Tech Stack

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------

* Programming Language: Java — Core language used for writing test scripts and framework logic.

* Testing Framework: TestNG — Used for test organization, grouping, and execution management.

* BDD Tool: Cucumber — Provides BDD-style testing using .feature files written in Gherkin.

* API Automation Library: Rest Assured — Handles API request building, response parsing, and assertions.

* Build Tool: Maven — Manages project dependencies, plugins, and build lifecycle.

* Reporting:

* Cucumber HTML Report — Generates detailed HTML execution reports.

* Surefire Report — Captures and logs test results for TestNG runs.

* Logging: Custom logging via Java log utilities (stored in logging.txt).

* Containerization: Docker — Enables running tests in isolated and repeatable environments.

* Version Control: Git & GitHub — For source management and collaboration.

------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

<img width="1900" height="1008" alt="_D__Maventous%20API%20Framework_technobug-api_reports_cucumber-html-reports_overview-tags html" src="https://github.com/user-attachments/assets/86db5988-9705-4113-a4e0-bf196f2b8ff4" />

-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🧱 Project Structure

* Root Folder: maventous-api/ — Main project directory containing source code, reports, and configuration files.

* src/main/java/pojo/

  --> Contains POJO (Plain Old Java Object) classes for mapping API request and response payloads.

  -->Example: createKeywords.java

* src/test/java/features/
 
  --> Contains all .feature files written in Gherkin syntax for BDD scenarios.

  --> Example: Keyowrds.feature

* src/test/java/stepDefinations/

  --> Holds all Cucumber step definition files implementing the steps from feature files.

  --> Example:

      StepDefinations.java → Implements feature file steps.

* Hooks.java → Handles setup and teardown before and after test execution.

* src/test/java/resources/

  --> Contains reusable classes, utility files, and configurations for API testing.

  --> Example files:

* APIResources.java → Manages all API endpoints.

* TestDataBuild.java → Builds dynamic payloads for requests.

* TokenManager.java → Generates and handles authentication tokens.

* Utils.java → Reusable helper methods for validation and configuration.

* global.properties → Stores base URL, environment, and global test data.

* src/test/java/cucumber/Options/

  --> Contains TestRunner.java which serves as the execution entry point for Cucumber tests.

* reports/

  --> Stores generated test reports after execution.

  --> Includes:

      cucumber-html-reports → HTML reports for visual results.

      jsonReports → JSON reports for integrations.

      surefire-reports → TestNG execution results.

* target/

  --> Automatically generated folder after build or test execution.

  --> Contains compiled classes, generated sources, and final reports.

* dockerfile

  --> Defines Docker image configuration for running the framework in a containerized environment.

* pom.xml

  --> Maven configuration file containing dependencies, plugins, and build setup.

* logging.txt

  --> Captures runtime logs and test execution details.

* .gitignore / .project / .classpath / .settings/

   --> Git and IDE-related configuration files (mainly for Eclipse).

