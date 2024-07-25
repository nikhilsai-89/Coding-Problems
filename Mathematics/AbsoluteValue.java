/*
 * You are given an interger I, find the absolute value of the interger I.

 

Example 1:

Input:
I = -32
Output: 32
Explanation: 
The absolute value of -32 is 32.
 

Example 2:

Input:
I = 45
Output: 45
Explanation: 
The absolute value of 45 is 45 itself.
 */

public class AbsoluteValue {
    public static int absolute(int I) {
        // code here
        return Math.abs(I);
    }

    public static void main(String[] args) {
        System.out.println(absolute(-2));
    }
}
