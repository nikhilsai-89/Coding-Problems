
/*
 * Convert Celsius To Fahrenheit
Difficulty: BasicAccuracy: 82.57%Submissions: 62K+Points: 1
Given a temperature in celsius C. You need to convert the given temperature to Fahrenheit.

Example 1:

Input:
C = 32
Output: 89.6
Explanation: Using the conversion 
formula of celsius to farhenheit , it
can be calculated that, for 32 degree
C, the temperature in Fahrenheit = 89.6
Example 2:

Input:
50
Output: 122
Explanation: Using the conversion 
formulaof celsius to farhenheit, it
can be calculated that, for 50 degree
C, the temperature in Fahrenheit = 122.
 */

public class CtoF {
    public static double cToF(int C) {
        // Your code here
        return (double) C * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        System.out.println(cToF(100));
    }
}
