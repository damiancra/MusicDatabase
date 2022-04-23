<<<<<<< HEAD
# Practical Project Specification
Music Database
Introduction
=======
Practical Project Specification

Music Database

Introduction

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
This project will encapsulate concepts from:

● Agile & Project Management (Git, Jira)
● Databases & Cloud Fundamentals (H2, MySQL)
● Programming Fundamentals (Java)
● API Development (Spring Boot)
● Automated Testing (JUnit, Mockito)

Must be fully CRUD functional.

The API must be fully functional and capable of handling HTTP requests from a tool such as Postman and it must be able to show that data has been persisted to the database using a tool such as MySQL Workbench or the H2 console.
<<<<<<< HEAD
Objective
=======

Objective

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
The overall objective of the project is the following:

To create a Spring Boot API, with utilisation of supporting tools, methodologies, and technologies, that encapsulates all fundamental and practical modules covered during training.

Specifically, to create a Spring Boot API using:

● an application back-end developed using the language from your Programming Fundamentals module (e.g. Java)
● a managed database hosted locally or within the Cloud Provider (e.g. H2 or MySQL (local / GCP)
● a means of making API calls (Postman) and a means of checking persistence (Workbench/H2 console)

Plan the approach to complete the project using design techniques. The project is expected to have been rigorously tested in the key areas explored above, using the technologies covered during all fundamental and practical modules (e.g. JUnit, Mockito).
Scope
<<<<<<< HEAD
=======

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
The requirements of the project are as follows:

Code fully integrated into a Version Control System using the feature-branch model: main/dev/multiple features.
● A project management board with full expansion on user stories, acceptance criteria and tasks needed to complete the project.
● A risk assessment which outlines the issues and risks faced during the project timeframe.
● A relational database, locally or within the Cloud, which is used to persist data for the project.
● A functional application ‘back-end’, written in a suitable framework of the language covered in training (Java/Spring Boot), which meets the requirements set on your Scrum Kanban board.
● A build (.jar) of your application, including any dependencies it might need, produced using an integrated build tool (Maven).
● A series of API calls designed with postman, used for CRUD functionality. (Create, Read, Update, Delete)
● Fully designed test suites for the application you are creating, including both unit and integration tests.

Consider the concept of MVP (Minimum Viable Product) in planning the project.

<<<<<<< HEAD

=======
>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Constraints

The application must also strictly adhere to the following technological constraints:

Version Control System: Git
● Source Code Management: GitHub
● Kanban Board: Jira (Scrum Board)
● Database Management System: H2 or MySQL Server (local or GCP)
● Back-End Programming Language: Java
● API Development Platform: Spring
● Build Tool: Maven
● Unit & Integration testing: JUnit, Mockito
<<<<<<< HEAD
=======

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Deliverable

The final deliverable for this project is a GitHub repository containing the completed Spring Boot API & a build of the application (.jar), as well as any documentation listed in the scope section above. Also a link to a Jira board in the README.md file.

Utilisation of the feature-branch model, and a push of a working copy of the code to the main branch regularly. It is recommended to use the feature-<concept> naming strategy for your feature branches.
<<<<<<< HEAD
Deliverables Checklist (MVP)
=======

Deliverables Checklist (MVP)

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Codebase
● Spring Boot API with full CRUD functionality.
● Sensible package structure (back-end).
● Adherence to best practices.
<<<<<<< HEAD
Testing
● Unit and integration testing for the project back-end.
● Reasonable test coverage of the src/main/java folder.
=======

Testing
● Unit and integration testing for the project back-end.
● Reasonable test coverage of the src/main/java folder.

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Continuous Integration
● GitHub repository utilising the feature-branch model
● The main branch must compile
● A build of the application is present in the root folder of your git repo
o A .jar which can be deployed from the command-line (java -jar <filename.jar>)
<<<<<<< HEAD
=======

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Repository & Documentation
● A completed project management board, including user stories, acceptance criteria, estimations via story points, and prioritisation via MoSCoW methodology. You must add your trainer(s) as collaborators on your Jira board.
● A working .gitignore for ignoring build-generated files and folders
● You are also expected to make a README.md file and to fill this README with information about this project. It should contain the following headers:
o Why are we doing this?
o How I expected the challenge to go.
o What went well? / What didn't go as planned?
o Possible improvements for future revisions of the project.
o Screenshots showing your postman requests and the output from the API.
o Screenshots of your database to prove that data is being persisted.
o Screenshot of your test results, including coverage report.
o Link to Jira Board - You must add your trainer(s) as collaborators also.
● A documentation folder containing:
o A completed risk assessment, utilising a matrix, in .pdf format
<<<<<<< HEAD
=======

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Stretch Goals:
● Create an ERD diagram for your specified domain and include it in the documentation folder.
● Use custom queries, such as ‘find by name’.
● Include custom exceptions in your service.
● Include the use of DTOs
● Include the use of Lombok
● Achieve 80% test coverage of the src/main/java folder.
<<<<<<< HEAD
=======

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Mark Scheme

The skills evaluated within this project are described within the SFIA 7 framework; please see https://sfia-online.org/en/framework for further information.

The skills which this project will evaluate are the following:
<<<<<<< HEAD
=======

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Programming & Software Development (PROG)
● Designs, codes, verifies, tests, amends, and refactors simple programs/scripts.
● Tests, documents, amends, and refactors simple programs/scripts.
● Applies agreed standards and tools, to achieve a well-engineered result.
<<<<<<< HEAD
Software Design (SWDN)
● Creates and documents detailed designs for simple software applications or components applying agreed modelling techniques, standards, patterns, and tools.
● Creates and documents the development and/or deployment of an application, applying agreed standards and tools.
=======

Software Design (SWDN)
● Creates and documents detailed designs for simple software applications or components applying agreed modelling techniques, standards, patterns, and tools.
● Creates and documents the development and/or deployment of an application, applying agreed standards and tools.

>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba
Testing (TEST)
● Designs test cases and creates test scripts and supporting data.
● Analyses and reports test activities and results.
Systems Integration & Build (SINT)
● Produces software builds from software source code.
● Conducts tests as defined in an integration test specification, records the details of any failures. Analyses and reports on integration test activities and results.
● Identifies and reports issues and risks.

<<<<<<< HEAD
/c/Users/crabb/eclipse-workspace/Music

=======
>>>>>>> 05e43573e11afcbc27d171e63171138d8c827fba

