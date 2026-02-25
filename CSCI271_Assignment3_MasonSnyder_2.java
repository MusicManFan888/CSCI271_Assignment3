/*************************************************************************
* CSCI 271 Assignment 3 – Question 2
*
* Author: Mason Snyder
* Course: CSCI 271 Spring 2026
* Date: 2/22/2026
*
* Purpose:
* Counts occurrences of an inputted character in a string using recursion.
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
* Class: CSCI271_Assignment3_MasonSnyder_2
*
* Interface:
* countChar(String S, char C) → int count
*************************************************************************/
public class CSCI271_Assignment3_MasonSnyder_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Keyboard input reader

        System.out.print("Enter string: ");
        String S = input.nextLine(); // User string, displayed in next line
	System.out.println("String Input: " + S);

        System.out.print("Enter character: ");
        char C = input.next().charAt(0); // User char, displayed in next line
	System.out.println("Character Input: " + C);

        int count = countChar(S, C); // Result
        System.out.println("Occurrences = " + count);
    }

    /*****************************countChar****************************
    * Description: Recursively counts occurrences of C in S.
    *
    * Parameters:
    * S (input) – source string
    * C (input) – character to count
    *
    * Pre: S not null
    * Post: Returns occurrences of C in S
    *
    * Returns: integer count of occurances
    *
    * Called by: main
    * Calls: countChar
    ************************************************************************/
    public static int countChar(String S, char C)
    {
        // Base case: empty string
        if (S.equals(""))
        {
            return 0;
        }

        // Check first char
        int match = (S.charAt(0) == C) ? 1 : 0;

        // Recursive count remainder
        return match + countChar(S.substring(1), C);
    }
}