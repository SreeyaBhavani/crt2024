In an organization, they were playing a keyword game and they want to print the word which is ending with 's'. So help them by writing a program to print the words ending with 's'

Input Format

Read a string

Constraints

string

Output Format

Print result

Sample Input 0

this was mine
Sample Output 0

this
was
Sample Input 1

kings are born at june
Sample Output 1

kings
Sample Input 2

we are programmers
Sample Output 2

programmers
==============================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String str[]=s1.split(" ");
        for(int i=0;i<str.length;i++)
        {
            char s2[]=str[i].toCharArray();
            int len=s2.length;
            if(s2[len-1]=='s')
            {
                System.out.println(str[i]);
            }
        }
    }
}
