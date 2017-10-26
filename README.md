# JUnitPractice
This repository contains my own exercising related to JUnit testing

Initialization: import JUnit executable jar files to a folder where java and test files will be.
				This example used junit-4.12.jar and hamcrest-core-1.3.jar

1)Create file Calculator.java
	1.1)Compile it with command                ------>    javac Calculator.java
	1.2)Calculator.class wil be created
2)Create JUnit's test-file CalculatorTest.java
	2.1)Compile it with command                ------>    javac -cp .;junit-4.12.jar;hamcrest-core-1.3.jar CalculatorTest.java
	2.2)CalculatorTest.class wil be created
3)Run test with command                        ------>    java -cp .;junit-4.12.jar;hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest


4)Console OUTPUT: 
		JUnit version 4.12
		.
		Time: 0,004

		OK (1 test)