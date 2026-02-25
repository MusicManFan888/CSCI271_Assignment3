/*************************************************************************
* CSCI 271 Assignment 3 – Question 3
*
* Author: Mason Snyder
* Course: CSCI 271 Spring 2026
* Date: 2/22/2026
*
* Purpose:
* Finds maximum integer in an array recursively.
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
* Class: CSCI271_Assignment3_MasonSnyder_3
*
* Purpose:
* Finds maximum integer in an array recursively.
*
* Interface:
* maxRecursive(int[] A, int n) → max value
*************************************************************************/
public class CSCI271_Assignment3_MasonSnyder_3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); //Keyboard input reader

        System.out.println("Enter number of elements: ");
        int n = input.nextInt(); // Size
	System.out.println("Size is: " + n);

        int[] A = new int[n]; // Array storage

        // Read array values
        for (int i = 0; i < n; i++)
        {
            System.out.println("Enter element " + i + ": ");
            A[i] = input.nextInt();
	    System.out.println("Element entered: " + A[1]);
        }

        int max = maxRecursive(A, n); // Full result
        System.out.println("Maximum = " + max);
    }

    /*****************************maxRecursive****************************
    * Description: Recursively finds maximum in first n elements of A.
    *
    * Parameters:
    * A (input) – integer array
    * n (input) – number of elements considered
    *
    * Pre: n ≥ 1
    * Post: Returns max among A[0..n−1]
    *
    * Returns: maximum integer
    *
    * Called by: main
    * Calls: maxRecursive
    ************************************************************************/
    public static int maxRecursive(int[] A, int n)
    {
        // Base case: only one integer in the array
        if (n == 1)
        {
            return A[0];
        }

        int prevMax = maxRecursive(A, n - 1); // Maximum

        // Compares the last element
        if (A[n - 1] > prevMax)
        {
            return A[n - 1];
        }
        return prevMax;
    }
}