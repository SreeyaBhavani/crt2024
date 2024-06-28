Write a program to find the sum of factorial of each digit in the given number.

Input Format

Read a number

Constraints

1<=n<=10^7

Output Format

Print output

Sample Input 0

56
Sample Output 0

840
Sample Input 1

98427
Sample Output 1

408266
==========================================================================================
Code:
==========================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int /*fact=1,*/sum=0;
        while(n>0)
        {
            int d=n%10;
            int fact=1;
         for(int i=1;i<=d;i++)
         {   

            fact=fact*i;     
        }
            sum=sum+fact;
            n=n/10;
        }
        System.out.println(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
