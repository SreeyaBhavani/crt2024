Write a program to find the sum of elements in each row.

Input Format

Integers correspond to the size of rows and columns. Read elements of the array

Constraints

1<=n<=10^7

Output Format

Sum of each row in seperate line

Sample Input 0

3
3
1 2 3
7 3 1
7 4 1
Sample Output 0

6
11
12
Sample Input 1

4
3
1 2 3
4 5 6
7 8 9
4 3 8
Sample Output 1

6
15
24
15
===================================================================================================
code:
===================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
                Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        int n=s.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=s.nextInt();
            }
        }
         for(int i=0;i<m;i++)
        {    
             int sum=0;
            for(int j=0;j<n;j++)
            {
               sum+=a[i][j];
            }
             System.out.println(sum);
        
         }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
