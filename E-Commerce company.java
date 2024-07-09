An e-commerce company has a product list in its database. Each product key in the list is space separated, but due to a bug all the product keys were combined, converting the list into a string. The manager wishes to reproduce the product list by adding whitespaces after every X character in the string formed due to the bug.

Write an algorithm that will take t string formed due to the bug and put whitespaces after every X character in the string

Input Format

The first line of the input consists of string formed from the due to the bug. The last line consists of an integer charCount representing the number of characters after which whitespaces should be added in the string formed by the bug (X).

Constraints

string

Output Format

Print a space-separated string containing the product keys. The string should contain whitespaces after each charCount character.

Note If charCount is more than the last remaining characters, those characters will be used as they are.

Sample Input 0

abcdefg
2
Sample Output 0

ab cd ef g
Sample Input 1

language
3
Sample Output 1

lan gua ge
  ========================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner s=new Scanner(System.in);
        String s1=s.next();
        int n=s.nextInt();
        char ch[]=s1.toCharArray();
        int i=0,j=0;
         while(i<ch.length&&j<n)
        {
                System.out.print(ch[i]);
                i++;
                j++;
             if(j==n){
                 System.out.print(" ");
                 j=0;
             }
        }
    }
}
