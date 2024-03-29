# CMSC 350 Project 2
# Table of Contents
- [Project Description](#project-description)
- [Project Requirements](#project-requirements)
- [Test Cases](#test-cases)
- [Test Case Expected Output](#test-case-expected-output)
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

# Test Case Expected Output
<table>
<tr>
<th>Test Case</th>
<th>Expected Output</th>
</tr>
<tr>
<td>1</td>
<td>
<ul>
<li>Strong Order: True</li>
<li>Weak Order: True</li>
</ul>
</td>
</tr>
<tr>
<td>2</td>
<td>
<ul>
<li>Strong Order: True</li>
<li>Weak Order: True</li>
</ul>
</td>
</tr>
<tr>
<td>3</td>
<td>
<ul>
<li>Strong Order: False</li>
<li>Weak Order: True</li>
</ul>
</td>
</tr>
<tr>
<td>4</td>
<td>
<ul>
<li>Strong Order: False</li>
<li>Weak Order: True</li>
</ul>
</td>
</tr>
<tr>
<td>5</td>
<td>
<ul>
<li>Strong Order: False</li>
<li>Weak Order: False</li>
</ul>
</td>
</tr>
<tr>
<td>6</td>
<td>
<ul>
<li>Strong Order: False</li>
<li>Weak Order: False</li>
</ul>
</td>
</tr>
<tr>
<td>7</td>
<td>
<ul>
<li>Syntax Error</li>
</ul>
</td>
</tr>
<tr>
<td>8</td>
<td>
<ul>
<li>Syntax Error</li>
</ul>
</td>
</tr>
<tr>
<td>9</td>
<td>
<ul>
<li>Strong Order: True</li>
<li>Weak Order: True</li>
</ul>
</td>
</tr>
<tr>
<td>10</td>
<td>
<ul>
<li>Syntax Error</li>
</ul>
</td>
</tr>
</table>

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