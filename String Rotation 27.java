Write a program to Rotate the string in the specified direction and print the output.

Input Format

First line contains the String A. Second line contains the number of positions you have to shift the elements in the string. Third line contains the direction either 'L' or 'R'.

Constraints

1<=len(A)<1000

Output Format

Print the rotated string

Sample Input 0

javalang
3
L
Sample Output 0

alangjav
Sample Input 1

javalang
3
R
Sample Output 1

angjaval
Sample Input 2

welcome
5
L
Sample Output 2

mewelco
  ===========================================================================================================
 import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        int n=s.nextInt();
        char c=s.next().charAt(0);
        char ch[]=s1.toCharArray();
        int len=ch.length;
        char ch1[]=new char[len];
        int j=0;
        if(c=='L'){
        for(int i=n;i<len;i++)
             {
            ch1[j++]=ch[i];
             }
            
            for(int i=0;i<n;i++)
            {
                ch1[j++]=ch[i];
            }
        }
        if(c=='R'){            
            for(int i=len-n;i<len;i++)
            {
                ch1[j++]=ch[i];
            }
            for(int i=0;i<len-n;i++)
             {
            ch1[j++]=ch[i];
             }
        }
        for(int i=0;i<len;i++)
        {
            System.out.print(ch1[i]);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
} 
