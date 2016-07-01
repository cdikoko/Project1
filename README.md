# Project1
## Computer Programming II (Java), CS 232
##Introduction

* Authors: Austin Anderson and Clement Dikoko
* Date: February 22,2016
* Purpose: This program will ready a text file of names and output the names in alphabetical order by last name in their own individual files.

This program was assigned in my Computer Programming II course. The goal of this assignment, was to get the students to become familiar with sorting methods in java. The program takes a list of first names and last names and then output the names in alphabetical order by last name in their own individual files. 

##Notes

There were plenty of issues with getting the bubble sorter right, I had to study the logic behind a bubble sorter and reading many examples. Another issue was reading into the names.txt file. It was not working for some reason, and I didnt know why so I deleted everything and started from scratch with the help of my books and youtube. Writing the files into new text files was, suprisingly, pretty straightforward. 

##Names

This project was made using only one class, this was the first project that I have ever completed using the Java programming language.
To begin, I first created methods to get and set the first name and last name in the file. The format of the file is a long list of full names that each take up one line.

![alt](https://github.com/cdikoko/Project1/blob/master/Screenshot%20(29).png)

There are several names that repeat themselves in the list, first and last, which made it very harrd to find the correct method to sort through them. This was especially intimidating since there were 2000 names on the list. Logically it made sense to create and array and add the names to it. Once that was done, all that was needed was to loop through the names and sort them. The only problem, is that the names couldnt be sorted just by last name. Each last name needed to be in its own file, and within that file all the first names had to be sorted as well. 

What I did was create a compare method to compare the last names. If the last names match, it then compares the first names as well. Once that was completed, the names were added to an array. I made in such a way that the first name and last name were separated. This way it would be easier to sort by first AND last name later.

In class we went over a bubble sorter, which was what ended up being the method to sort the names for this project. The bubble sorter gave me some issues at first when it came to the basic logic; eventually many answers were found online to make the process easier. What the bubble sorter did was loop through the list and before the first for loop continued, the second for loop had to go through all the names to compare to the name in the first loop. So if the first name started with a B, and the second name started with an A, the loop will switch them before it continued. The bubble sorter was difficult but was what made it possible to sort through the list of names. An if statement then set the first name and last name to the variables i and j, which were the variables used in the loop. If the loop made it passed this point then that meant the name was in right place or it was the same name so the name. Next I created a new text file to write the files to. The end result was that now the program reads through the list of names and prints them to several text files alphabetically. It was tough and required alot of research a persistence, yet it was successful.


##Instructions

This program only contains one class, so to run it the user needs to download it to their computer with the text file containing the list of names. The files need to be in the same directory. Next the user needs to find and compile the file through the command line. 

![alt](https://github.com/cdikoko/Project1/blob/master/Screenshot%20(30).png)

![alt](https://github.com/cdikoko/Project1/blob/master/Screenshot%20(31).png)
![alt](https://github.com/cdikoko/Project1/blob/master/Screenshot%20(32).png)

#New Sorted Files
![alt](https://github.com/cdikoko/Project1/blob/master/Screenshot%20(33).png)
![alt](https://github.com/cdikoko/Project1/blob/master/Screenshot%20(34).png)
