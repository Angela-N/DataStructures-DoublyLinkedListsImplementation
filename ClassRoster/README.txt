ANGELA NAYIGA

CS-211  ASSIGNMENT 1

PART 1
Doubly Linked List implementation. 
I used the first implementation, a simple reference to the head and to the tail nodes of the list.
I used this because I wanted to have an empty doubly linked list at every start of adding a new student in my part 2. 

PART 2

 A Class Roster to keep track of students during the add/drop period
 Add/Remove student while maintaining the alphabetical order of the list
 Roster in form “Last Name, First Name” Also, has a unsorted wait list
 
 Instructions:
1. Run the class "RosterManager".
2. You will be prompted to input maximum number of students to be registered, input a Digit strictly!
3. Type "add" to add a file from a text file labelled "Assignment1Data.txt".
4. Type "remove" to delete items, then Type the name of the item that you want to delete.
5. Type "quit" to stop being prompted.
 
 
My Roster Implements all the following functions.

1. allow the user to specify the maximum size for the class roster (this facilitates testing!)
2. allow for addition of students to and removal of students from the class roster, keeping the roster in
alphabetic order at all times.
3. if the roster list reaches the specified maximum size, subsequent students should be added to a second
list, the “wait list”. The wait list is not alphabetized.
4. if the roster list drops below the specified maximum size, students should be added to the roster from
the wait list. The first student on the wait list should be moved to the roster and placed in the correct
alphabetic order.
5. display the names on the roster and on the wait list if there any names on it. Do not display any wait list
info if the wait list is empty.
6. Student nodes must have a name in “Last Name, First Name” format.


Credits:
I give credit to the TAs, the Text book and online resources such as Stack Overflow and HackeRank.