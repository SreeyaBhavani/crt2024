Write a program to find whether the given string is a palindrome or not

Input Format

Read a string

Constraints

string

Output Format

If the given string is a Palindrome display “Palindrome”, else display “Not a Palindrome”.

Sample Input 0

madam
Sample Output 0

Palindrome
Sample Input 1

java
Sample Output 1

Not a Palindrome
  ====================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            str2=str2+str1.charAt(i);
        }
        if(str1.equals(str2))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
