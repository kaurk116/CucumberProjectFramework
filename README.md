# CucumberProjectFramework
CucumberProjectFramework

<img width="355" height="301" alt="Screenshot from 2026-02-11 11-52-54" src="https://github.com/user-attachments/assets/00837073-723a-4ff2-8c54-bc5b91f1bb1b" />

<img width="1888" height="872" alt="cucumber bdd" src="https://github.com/user-attachments/assets/2d1168da-cd8e-4b04-a695-6111a8380499" />


Cucumber
----------

TDD - Test Driven Development

Ex: JUnit/TestNG (for Java), NUnit (for .NET), PyTest (for Python), Jasmine (for JavaScript)


BDD - Behavioral Driven Development

Ex:	Cucumber (supports multiple languages like Java, Ruby, JavaScript, etc.)
	SpecFlow (for .NET)
	Behave (for Python)
	JBehave (for Java)

team
----
stake holders/customer (non-tech)
product manager (non-tech)
project manager - (non-tech)
tester - tech
developer - tech
scrum master (non-tech)

BDD, or Behavior-Driven Development, emphasizes collaboration between technical and non-technical stakeholders 
through the use of a common language to describe the behavior of a system. 
It focuses on writing tests in a human-readable format, typically using a "given-when-then" structure, which helps clarify requirements and expectations.


Cucumber
-----------
1) Feature file
2) step definitions file
3) test runner file

Feature file contains scenarios & Steps.

Gherkin - language contains keywords..

Scenario
Given
When
Then
And


Pre-condition  - Given
Actions  - When
Validations  - Then


Login.feature
------------
Feature : User login
	Scenario: Succesful login
		Given the user opens application
		And  the user navigate to login page
		When the user entered valid user name and valid password
		And the user clicked on submit button.
		Then the user should see My account page.
		And the user name should be displayed on my account page


Step definition file contains methods which are represent to steps in feature file

testRunner class  ---> feature file, steps, report etc...



Cucumber project setup
--------------
1) Install cucumber eclipse plugin ( From eclipse market place)
2) Create Maven project
3) Update pom.xml with required dependencies.
***************************************************************************

Cucumber Framework
-------------------
1) Create Maven project -- Update pom.xml
2) Folder structure
3) Page Object classes, Base class, Hooks
4) Login feature file
5) Login steps
6) Test Runner - options
7) generate logs
8) cucumber reports
9)Extent reports
10) tagging  (Grouping)


s1 - @sanity
s2 - @refression
s3- @sanity  @regression

tags="@sanity"   ---->s1,s3

tags="@sanity and not @regression"   ---->s1

tags="@sanity or @regression" --->s1, s2, s3

tags="@sanity and @regression"  ---> s3


*********************************************
Cucumber framework
-------------
data driven testing
--
-> Scenario Outline Examples

Data driven testing using Excel sheet
-----
Test data
Scenario Outline
DataReader

passing multiple parameters nto one step using data table concept...

Run only failure screnarios..

run scenarios on grid..

run scenarios through pom.xml

run scenarios through maven command prompt
