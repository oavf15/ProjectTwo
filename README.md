# CMSC 350 Project 2
# Table of Contents
- [Project Description](#project-description)
- [Project Requirements](#project-requirements)
- [Test Cases](#test-cases)
- [Project Rubric](#project-rubric)

# Project Description
The programming project involves writing a program that examines a file of polynomials and
determines whether the polynomials in that file are in strictly ascending order using two different methods of
comparison. 

# Project Requirements
Project requirements can be found in [Project 2 PDF File](project2.pdf)

# Test Cases
Test cases will go here.

# Project Rubric
<table>
<tr>
<th>Criteria</th>
<th>Meets</th>
</tr>
<tr>
<td>Design</td>
<td>
<ul>
<li>Polynomial class implements Comparable and Iterable interfaces</li>
<li>Polynomial object implemented with a singly linked list</li>
<li>OrderedList class provides required methods and does not duplicate code</li>
<li>Unchecked exception class included</li>
</ul>
</td>
</tr>
<tr>
<td>Functionality</td>
<td>
<ul>
<li>Accepts input file as specified and populates array list</li>
<li>Detects polynomials with invalid syntax and correctly displays error</li>
<li>Displays polynomials in the required format as they are read in</li>
<li>Correctly determines whether a polynomial file is sorted by the weak order </li>
<li>Correctly determines whether a polynomial file is sorted by the strong order </li>
</ul>
</td>
</tr>
<tr>
<td>Test Plan</td>
<td>
<ul>
<li>Test cases include a file in both strong and weak sorted order</li>
<li>Test cases include a file in weak but not strong sorted order</li>
<li>Test cases include a file in neither strong nor weak sorted order</li>
<li>Test cases include files with both kinds of syntax errors</li>
<li>Test cases include a polynomial with exponents of 0, 1 and 2 or more </li>
</ul>
</tr>
<tr>
<td>Documentation</td>
<td>
<ul>
<li>Correct UML diagram included</li>
<li>Lessons learned included</li>
<li>Comment blocks included with each Java file</li>
</table>