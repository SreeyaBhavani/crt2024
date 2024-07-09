In a blind organization, they were playing the typing a keyword game and they want to correct the form of the word. So help them to by writing a program to remove all special symbols and print the characters of a string.

Input Format

Input consists of a string.

Constraints

Assume the maximum length of the string is 200. The characters in the string can contain both uppercase, lowercase, and symbols.

Output Format

print only alphabets string

Sample Input 0

pro$#&gra7m
Sample Output 0

program
Sample Input 1

Th%is is m67$y pro***gram
Sample Output 1

This is my program
  =================================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]>='a'&&ch[i]<='z')||(ch[i]>='A'&&ch[i]<='Z')||ch[i]==' ')
            {
                System.out.print(ch[i]);
            }
        }   /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
