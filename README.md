Java List Lambda Example
This project demonstrates how to use lambda expressions and the replaceAll() method to modify a list of numbers in Java.

It starts with a traditional list of integers, then doubles each number using a lambda, and finally prints the modified list.

Technologies Used
Java 8 or later

No external libraries required

How It Works
Create a list of integer numbers.

Add elements to the list manually.

Use replaceAll() with a lambda expression to modify each element.

Print each element using forEach and method reference.

The key part is using replaceAll():
numbers.replaceAll(number -> number * 2);
This lambda takes each number, multiplies it by 2, and updates the list.

It modifies the original list directly (in-place modification).

Key Concepts
Lambda Expressions: Short functions that can be passed around.

List.replaceAll(): Modifies all elements based on a given function.

forEach + Method Reference: A clean way to print or process each item in the list.

Requirements
Java JDK 8 or above installed.
