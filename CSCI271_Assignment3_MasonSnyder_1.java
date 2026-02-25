/*************************************************************************
* CSCI 271 Assignment 3 – Question 1
*
* Author: Mason Snyder
* Course: CSCI 271 Spring 2026
* Date: 2/22/2026
*
* Purpose:
* This program reads a string from the user and displays its length
* using a recursive function. No Loops.
*
*************************************************************************/

/*******************************************************************
* I declare and confirm the following:
* - I have not discussed this program code with anyone other than my
* instructor or the teaching assistants assigned to this course.
* - I have not used programming code obtained from someone else,
* or any unauthorised sources, including the Internet.
* - Any external sources are cited in comments.
* - I have not interfered with grading code.
*
* Mason Snyder
********************************************************************/

import java.util.Scanner;

/*************************************************************************
* Class: CSCI271_Assignment3_MasonSnyder_1
*
* Purpose:
* Uses recursion to find the length of a string.
*
* Interface:
* recursiveLength(String S) → returns length as integer
*************************************************************************/
public class CSCI271_Assignment3_MasonSnyder_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Keyboard input reader
        System.out.print("Enter a string: ");
        String S = input.nextLine(); // User string

        int length = recursiveLength(S); // Length result and display
        System.out.println("Length = " + length);
    }

    /*****************************recursiveLength****************************
    * Description: Recursively computes the length of string S.
    *
    * Parameters:
    * S (input) – string whose length is to be computed
    *
    * Pre: S is not null
    * Post: Returns number of characters in S
    *
    * Returns: integer length of S
    *
    * Called by: main
    * Calls: recursiveLength
    ************************************************************************/
    public static int recursiveLength(String S)
    {
        // Base case: empty string has length 0
        if (S.equals(""))
        {
            return 0;
        }

        // Recursive case: count first char + remainder
        return 1 + recursiveLength(S.substring(1));
    }
}