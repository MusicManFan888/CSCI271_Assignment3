/*************************************************************************
* CSCI 271 Assignment 3 – Question 6
*
* Author: Mason Snyder
* Course: CSCI 271 Spring 2026
* Date: 2/22/2026
*
* Purpose:
* This program reads a list of integers from the user, stores them in an array,
* and computes the sum of all even integers using a recursive function.
* The sum is printed by the main program; the recursive function does not print.
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
* Class: CSCI271_Assignment3_MasonSnyder_6
*
* Purpose:
* Computes the sum of even numbers in an array of integers using recursion.
*
* Interface:
* sumEven(int[] A, int n) → sum of even numbers in first n elements
*************************************************************************/
public class CSCI271_Assignment3_MasonSnyder_6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); // Keyboard input reader

        System.out.println("Enter number of elements: ");
        int n = input.nextInt(); // Array size, displayed in the next line
	System.out.println("Array size: " + n);

        int[] A = new int[n]; // Array to store integers

        // add integers into array
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter element " + i + ": ");
            A[i] = input.nextInt();
        }

        // Display entered array
        System.out.println("You entered: ");
        for (int i = 0; i < n; i++)
        {
            System.out.println(A[i] + " ");
        }
        System.out.println();

        // Calls the recursive function to add all even numbers
        int sum = sumEven(A, n);
        System.out.println("Sum of even numbers = " + sum);
    }

    /*****************************sumEven****************************
    * Description: Finds the sum of even integers in
    * the first n elements of array A using recursion.
    *
    * Parameters:
    * A (input) – integer array
    * n (input) – number of elements considered (from start of array)
    *
    * Pre: n >= 0
    * Post: Returns sum of even integers in A
    *
    * Returns: integer sum
    *
    * Called by: main
    * Calls: sumEven
    ************************************************************************/
    public static int sumEven(int[] A, int n)
    {
        // Base case: no even elements(?)
        if (n == 0)
        {
            return 0;
        }

        // Add current element if even
        int add = (A[n - 1] % 2 == 0) ? A[n - 1] : 0;

        // Recursive calling for remaining elements
        return add + sumEven(A, n - 1);
    }
}