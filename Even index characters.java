Accept string from the user and display only those characters which are present at an even index

Input Format

Read a string

Constraints

string

Output Format

Printing the Even Index Positions and its value one by one

Sample Input 0

python
Sample Output 0

0 p
2 t
4 o
Sample Input 1

Programming
Sample Output 1

0 P
2 o
4 r
6 m
8 i
10 g
===================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+" "+ch[i]);
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
