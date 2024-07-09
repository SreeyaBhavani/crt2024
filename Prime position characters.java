Write a program to display the characters in prime position of a given string.

Input Format

Read a string

Constraints

string

Output Format

Print prime position characters

Sample Input 0

Computer
Sample Output 0

omue
Sample Input 1

Characters in Prime Position
Sample Output 1

haat nies
=================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        for(int i=1;i<=ch.length;i++)
        {
            int j=1,cnt=0;
            while(j<=i)
            {
                if(i%j==0)
                    cnt++;
                j++;
            }
            if(cnt==2)
            {
                System.out.print(ch[i-1]);
            }
        }
    
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
