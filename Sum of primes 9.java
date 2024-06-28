Write a program to calculate the sum of primes present in the digits of the given number.

Input Format

The input contains an integer N

Constraints

1<=n<=10^7

Output Format

Print sum of primes in the digits of the given number

Sample Input 0

333
Sample Output 0

9
Sample Input 1

345
Sample Output 1

8
===============================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        while(n>0)
        {
            int d=n%10;
            for(int i=1;i<=d;i++)
            {
                if(d==2 || d==3 || d==5 || d==7)
                    sum=sum+d;
                break;
            }
            n=n/10;
        }
          System.out.println(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
