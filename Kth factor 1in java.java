A positive integer d is said to be a factor of another positive integer N if when N is divided by d, the remainder obtained is zero. For example, for number 12, there are 6 factors 1, 2, 3, 4, 6, 12. Every positive integer k has at least two factors, 1 and the number k itself. Given two positive integers N and K, write a program to print the kth largest factor of N.

Input Format

The first line of input contains space-separated list of positive integer pairs(N K)

Constraints

1 < N < 10000000000. 1 < K < 600

Output Format

Print the kth highest factor of N. If N does not have k factors, the output should be 1.

Sample Input 0

12 3
Sample Output 0

4
Explanation 0

N is 12, K is 3.
The factors of 12 are (1, 2, 3, 4, 6, 12)
The highest factor is 12, the second-highest factor is 6 and the third-highest factor is 4.
Hence, the output is 4.
=====================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int c=0;
        for(int i=n;i>0;i--){
            if(n%i==0){
                c++;
            }
            if(c==k){
                System.out.print(i);
              return;
            }
        }
            
     System.out.print("1");
        return;/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
