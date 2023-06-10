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
Project requirements can be found in [Project 2 PDF File](Project2.pdf)

# Test Cases
* Test Case 1: [Both strong and weak sorted order](src/test_cases/test_case1.txt)
* Test Case 2: [Both strong and weak sorted order](src/test_cases/test_case2.txt)
* Test Case 3: [Weak but not strong sorted order](src/test_cases/test_case3.txt)
* Test Case 4: [Weak but not strong sorted order](src/test_cases/test_case4.txt)
* Test Case 5: [Neither strong nor weak sorted order](src/test_cases/test_case5.txt)
* Test Case 6: [Neither strong nor weak sorted order](src/test_cases/test_case6.txt)
* Test Case 7: [Syntax errors - wrong exponent order](src/test_cases/test_case7.txt)
* Test Case 8: [Syntax errors - non-integer exponent](src/test_cases/test_case8.txt)
* Test Case 9: [Polynomial with exponents of 0, 1, and 2](src/test_cases/test_case9.txt)
* Test Case 10: [Polynomial with exponents of 0, 1, 2, and a syntax error](src/test_cases/test_case10.txt)

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
</ul>
</table>