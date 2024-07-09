Write a program to find whether the given two strings

Input Format

Input consists of 2 strings.

Constraints

string

Output Format

If two strings are same, display “Strings are same”, else display “Strings are not same”.

Sample Input 0

java
java
Sample Output 0

Strings are same
Sample Input 1

python
Java
Sample Output 1

Strings are not same
================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.next();
        String str2=s.next();
        if(str1.equals(str2))
        {
            System.out.println("Strings are same");
        }
        else
        {
            System.out.println("Strings are not same");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
