# HR-Haust2017-Hugb-StringCalculator

SC-T-303-HUB </br>
Autumn 2017</br>
A simple Git project</br>

Instructor: Hannes Pétursson
</br>
Student: Jón Pétur Jónsson / jonpj16</br>
</br>TDD Exercise
</br>Purpose
</br>Learn to use Test Driven Development to create a program.
</br>Description
</br>This is a individual assignment.
</br>1. Create a GitHub repository called StringCalculator
</br>2. Share this repository with the teachers account: hap2000
</br>3. Programming language is Java
</br>4. After each TDD cycle you need to create git commit with descriptive message. If a
</br>commit is missing for that step, no score is given for that step.
</br>5. When the project is finished you turn in the url to the GitHub repository in Canvas.
</br>In this exercise you are going to solve a popular Coding Kata called String Calculator. This
</br>kata was created by Roy Osherove and is designed to help you learn TDD coding and
</br>refactoring.
</br>Try not to read ahead – do one task at a time. Work incrementally.
</br>Kata Steps
</br>1. Create a String calculator with a method int Add(string numbers)
</br>i. The method can take 0, 1, or 2 numbers and will return their sum.
</br>ii. An empty string will return 0.
</br>iii. Example inputs: “”, “1”, or “1,2”
</br>iv. Start with the simplest test case of an empty string. Then 1 number. Then 2 numbers.
</br>v. Remember to solve things as simply as possible, forcing yourself to write tests for
</br>things you didn’t think about.
</br>vi. Remember to refactor after each passing test.
</br>2. Allow the Add method to handle an unknown number of arguments/numbers.
</br>3. Allow the Add method to handle new lines between numbers (instead of commas).
</br>i. Example: “1\n2,3” should return 6.
</br>ii. Example: “1,\n” is invalid, but you don’t need a test for this case.
</br>iii. Only test correct inputs – there is no need to deal with invalid inputs for this kata.
</br>4. Calling Add with a negative number will throw an exception “Negatives not allowed: “
</br>listing all negative numbers that were in the list of numbers.
</br>i. Example “-1,2” throws “Negatives not allowed: -1”
</br>ii. Example “2,-4,3,-5” throws “Negatives not allowed: -4,-5”
</br>5. Numbers bigger than 1000 should be ignored.
</br>Example: “1001,2” returns 2
</br>6. Allow the Add method to handle a different delimiter:
</br>i. To change the delimiter, the beginning of the string will contain a separate line that
</br>looks like this: “//[delimiter]\n[numbers]”
</br>ii. Example: “//;\n1;2” should return 3 (the delimiter is ;)
</br>iii. This first line is optional; all existing scenarios (using , or \n) should work as before.
</br>It is recommended that you practice you TDD skills by redoing this exercise several
</br>times or other TDD katas (search for TDD Kata). You can try to do as many steps as
</br>you can in a 60 minute period. I recommend that you try the kata again from scratch
</br>until you can complete the entire thing within 30 minutes. In this exercise you need to
</br>finish all steps.</br>