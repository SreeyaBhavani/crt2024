Write a program to count the number of vowels in the given string.

Input Format

Read a string

Constraints

string

Output Format

print the number of Vowels.

Sample Input 0

Java language
Sample Output 0

6
Sample Input 1

python LANGUAGE
Sample Output 1
  5
  =========================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int c=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
            {
                c++;
            }
        }
        System.out.println(c);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
