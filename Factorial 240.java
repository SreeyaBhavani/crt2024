Repeatedly find the sum of digits of a number until it becomes a single-digit number (say sod). Then compute the factorial of sod and print it.

Input Format

One line containing an integer "n" denoting number

Constraints

1<=n<=10^7

Output Format

One number denoting the factorial of single digit

Sample Input 0

23
Sample Output 0

120
Explanation 0

Sum of digits: 23 --> 2+3 = 5 Factorial of 5 is 120

Sample Input 1

99
Sample Output 1

362880
Explanation 1

sum of digits 99 --> 9+9=18 if result>9 then repeat the same process until single digit 18 --> 1+8=9 Factorial of 9 is 362880
=========================================================================================================================================
import java.io.*;
import java.util.*;

public class Solution {
           public static int SumofDigits(int n){
               int s=0;
           
               while(n>0){
                   int x=n%10;
                   s+=x;
                   n=n/10;
               }
          s=Singledig(s);
               return s;
           }
    public static int Singledig(int m){
        if(m>9){
            m=SumofDigits(m);
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=SumofDigits(n);
      // int sin=Singledig(sum); 
      long fact=1;
        while(sum>1){
            fact*=sum;
            sum--;
        }
        System.out.print(fact);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
