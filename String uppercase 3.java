Write a program to change the given string to uppercase.

Input Format

Input consists of 1 string.

Constraints

string

Output Format

Output print the Uppercase of given string.

Sample Input 0

good
Sample Output 0

GOOD
Sample Input 1

Java Language
Sample Output 1

JAVA LANGUAGE
============================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        System.out.println(str1.toUpperCase());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
