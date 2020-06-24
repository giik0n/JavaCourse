<p align="center"><img src="https://img-a.udemycdn.com/course/750x422/2669808_fcbe.jpg"></p>

# JavaCourse
This repository contains Moodle Java Development (K) course.
## Technologies
Java 8
## Description
### Array Practice
Contains work with lines array from text file.

### Class Creation
Explains java Inheritance and Polymorphism.

### Cycle Practice
Work with different types of cycles.

### Employees
Second moodle labwork.

### Files Management
Logs file parser. Work with large files.

### JavaCollectionsFramework
Contains comparing two types of List - Array list and LinkedList.

### MoodleLab1
First moodle labwork.

### COMPANY Service implementation
Simply shows shot we can implement service interface.
There are two methods which finds topl level company, and counting company and childs employees.
#### Test
    //Company{parent=null, employeesCount=2} means chief company
    Top level parent for design: Company{parent=null, employeesCount=2}
    Top level parent for developer: Company{parent=null, employeesCount=2}
    Top level parent for frontend: Company{parent=null, employeesCount=2}
    Top level parent for lawyer: Company{parent=null, employeesCount=2}
    Top level parent for accounting: Company{parent=null, employeesCount=10}
    Chief and childs employees: 22
    Accounting and childs employees: 10
    Developer and childs employees: 10
    Everything works awesome!)
### Mulithreading.
This project comparing logs file parsing speed between one thread and five threads
#### Output
    File: ERROR2019-10-15.txt starts at: 2020-06-24T17:36:47.272
    File: ERROR2019-10-15.txt finished at: 2020-06-24T17:36:49.439
    File: ERROR2019-10-16.txt starts at: 2020-06-24T17:36:49.439
    File: ERROR2019-10-16.txt finished at: 2020-06-24T17:36:50.917
    File: ERROR2019-10-17.txt starts at: 2020-06-24T17:36:50.918
    File: ERROR2019-10-17.txt finished at: 2020-06-24T17:36:52.122
    File: ERROR2019-10-18.txt starts at: 2020-06-24T17:36:52.122
    File: ERROR2019-10-18.txt finished at: 2020-06-24T17:36:53.001
    File: ERROR2019-10-19.txt starts at: 2020-06-24T17:36:53.001
    File: ERROR2019-10-19.txt finished at: 2020-06-24T17:36:53.859
    One thread time: 6604ms
    File: ERROR2019-10-20.txt starts at: 2020-06-24T17:36:53.863
    File: ERROR2019-10-22.txt starts at: 2020-06-24T17:36:53.863
    File: ERROR2019-10-21.txt starts at: 2020-06-24T17:36:53.863
    File: ERROR2019-10-23.txt starts at: 2020-06-24T17:36:53.865
    File: ERROR2019-10-25.txt starts at: 2020-06-24T17:36:53.865
    File: ERROR2019-10-20.txt finished at: 2020-06-24T17:36:56.636
    File: ERROR2019-10-23.txt finished at: 2020-06-24T17:36:56.646
    File: ERROR2019-10-25.txt finished at: 2020-06-24T17:36:56.648
    File: ERROR2019-10-22.txt finished at: 2020-06-24T17:36:56.651
    File: ERROR2019-10-21.txt finished at: 2020-06-24T17:36:56.652
Multi threads time: 2790ms
