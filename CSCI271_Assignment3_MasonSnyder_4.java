/*************************************************************************
* CSCI 271 Assignment 3 – Question 4
*
* Author: Mason Snyder
* Course: CSCI 271 Spring 2026
* Date: 2/22/2026
*
* Purpose:
* This program reads a long integer N and a single digit D from the user,
* then recursively counts how many times D appears in N.
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
* Class: CSCI271_Assignment3_MasonSnyder_4
*
* Purpose:
* Provides recursive counting of a digit in a long integer.
*
* Interface:
* countDigit(long N, int D) → int count
*************************************************************************/
public class CSCI271_Assignment3_MasonSnyder_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Keyboard input reader

        System.out.println("Enter the long integer N: ");
        long N = input.nextLong(); // Long integer input, displayed in next line
	System.out.println("Long integer Input: " + N);

        System.out.println("Enter single digit D: ");
        int D = input.nextInt(); // Digit to count, displayed in next line
	System.out.println("Digit Input: " + D);

        int count = countDigit(N, D); // Counted occurrences
        System.out.println("Occurrences of " + D + " = " + count);
    }

    /*****************************countDigit****************************
    * Description: Uses recursion to counts how many times digit D appears in integer N.
    *
    * Parameters:
    * N (input) – long integer in which to count digits
    * D (input) – single digit 0–9 to count
    *
    * Pre: N >= 0, 0 <= D <= 9
    * Post: Returns number of occurrences of D in N
    *
    * Returns: integer count
    *
    * Called by: main
    * Calls: countDigit
    ************************************************************************/
    public static int countDigit(long N, int D)
    {
        // Base case: no digits present
        if (N == 0)
        {
            return 0;
        }

        int match = ((N % 10) == D) ? 1 : 0;

        // Recursive call with remaining digits
        return match + countDigit(N / 10, D);
    }
}