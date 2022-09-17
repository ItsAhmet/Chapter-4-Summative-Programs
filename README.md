# Chapter-4-Summative-Programs

Chapter 4 - Summative Programs

1. Freezing and Boiling Points
The following table lists the freezing and boiling points of several substances in Fahrenheit.
Substance
Freezing Point
Boiling Point
Ethyl Alcohol
-173
172
Oxygen
-362
-306
Water
32
212

Design a FreezeBoil class object that stores temperature as a single instance variable. The class should also have non-static methods for the user to check:

isEthylFreezing. Should return the boolean value true if the temperature stored in the temperature field is at or below the freezing point of ethyl alcohol.
Otherwise, return false.
isEthylBoiling. Should return the boolean value true if the temperature stored in the temperature field is at or above the boiling point of ethyl alcohol.
Otherwise, return false.
isOxygenFreezing. Should return the boolean value true if the temperature stored in the temperature field is at or below the freezing point of oxygen.
Otherwise, return false.
isOxygenBoiling. Should return the boolean value true if the temperature stored in the temperature field is at or above the boiling point of oxygen.
Otherwise, return false.
isWaterFreezing. Should return the boolean value true if the temperature stored in the temperature field is at or below the freezing point of water. 
Otherwise, return false.
isWaterBoiling. Should return the boolean value true if the temperature stored in the temperature field is at or above the boiling point of water. 
Otherwise, return false.

The program should ask the user to enter a temperature and then display a list of the substances that will freeze at that temperature and those that will boil at that temperature. For example, if the temperature is -20, the class should report that water will freeze and oxygen will boil at that temperature.


2. Dictionary
Create a class called Dictionary that has the user enter three words. Write a method that will output the three words in alphabetical order.

3. Quiz
Create a class called QuizCH4 that gives the user a 3 question multiple choice test. Each question should be based on the concepts in this chapter and should contain four answer choices. Let the user know if he/she was correct or incorrect after each question. At the end of the test, tell the user his/her score (ex: 2 out of 3 , or 66%).

**CHALLENGE: The questions should be asked one at a time in a random order. 

4. Roulette Wheel Colors
On a roulette wheel, the pockets are numbered from 0 to 36. The colors of the pockets are
as follows:
Pocket 0 is green.
For pockets 1 through 10, the odd numbered pockets are red and the even numbered pockets are black.
For pockets 11 through 18, the odd numbered pockets are black and the even numbered pockets are red.
For pockets 19 through 28, the odd numbered pockets are red and the even numbered pockets are black.
For pockets 29 through 36, the odd numbered pockets are black and the even numbered pockets are red.

Ask the user to enter a pocket number, and displays whether the pocket is green, red, or black. The program should display an error message if the user enters a number that is outside the range of 0 through 36.

**CHALLENGE: How can we turn this program into a game? Modify the RoulettePocket program to make an interactive game between user and computer (or multiplayer). Write the rules for your game before your code. You must include at least one random statement and at least two separate methods in your program. 
	


