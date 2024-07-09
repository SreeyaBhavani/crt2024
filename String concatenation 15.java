Write a program to find the concatenation of the given two strings

Input Format

Input consists of 2 strings.

Constraints

string

Output Format

print result string

Sample Input 0

Sun
Microsystems
Sample Output 0

Sun Microsystems
Sample Input 1

Oracle
Corporation
Sample Output 1

Oracle Corporation
==============================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        String res=str1.concat(" ");
        String str=res.concat(str2);
        System.out.println(str);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
