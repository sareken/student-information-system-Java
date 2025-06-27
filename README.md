# student-information-system-Java-

This project is a simple Java-based Student Information System developed as part of a first-year Object-Oriented Programming course.

## Project Overview

The system allows for the management of university departments, students (undergraduate and graduate), and courses. It runs through a command-line interface and enables users to input and list information related to departments, students, and courses.

## Features

- Define academic departments
- Add undergraduate and graduate students
- Add and list courses
- Search for students or courses by name
- Display detailed information for all departments

## File Structure

- `AnaSayfa.java`: Main class that controls the program flow
- `Bolum.java`: Represents academic departments
- `Ogrenci.java`: Base class for all students
- `LisansOgrencisi.java`: Subclass for undergraduate students
- `YLOgrencisi.java`: Subclass for graduate students
- `Ders.java`: Represents courses

## How to Run

1. Make sure you have Java installed.
2. Place all `.java` files in the same folder.
3. Compile and run the main file:

```bash
javac AnaSayfa.java
java ÖDEV1.AnaSayfa
