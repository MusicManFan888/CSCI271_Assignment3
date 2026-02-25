/*************************************************************************
* CSCI 271 Assignment 3 – Question 5
*
* Author: Mason Snyder
* Course: CSCI 271 Spring 2026
* Date: 2/22/2026
*
* Purpose:
* Reverses a string using recursion.
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
* Class: CSCI271_Assignment3_MasonSnyder_5
*
* Interface:
* reverse(String S) → reversed string S
*************************************************************************/
public class CSCI271_Assignment3_MasonSnyder_5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Keyboard Input reader

        System.out.print("Enter string: ");
        String S = input.nextLine(); // String input, displayed int he next line
	System.out.println("String Input: " + S);

        String s = reverse(S);
        System.out.println("Reversed = " + s);
    }

    /*****************************reverse****************************
    * Description: Recursively reverses string S.
    *
    * Parameters:
    * S (input) – original string
    *
    * Pre: S is not null
    * Post: Returns reversed string
    *
    * Returns: reversed S, returned as s
    *
    * Called by: main
    * Calls: reverse
    ************************************************************************/
    public static String reverse(String S)
    {
        // Base: empty string
        if (S.equals(""))
        {
            return "";
        }

        return reverse(S.substring(1)) + S.charAt(0);
    }
}
