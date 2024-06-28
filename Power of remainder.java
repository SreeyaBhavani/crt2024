In this program we will calculate the power of a number using C programming. We want to calculate the power of any given number so you need to multiply that particular number power of time. Ex:- Let suppose number is 24 so we need to multiply with 4 times of 2. That is 2*2*2*2=16. Number is 53 so we need to multiply with 3 time of 5. That is 5*5*5=125

Input Format

Read n value

Constraints

1<=n<=10^7

Output Format

Print output

Sample Input 0

24
Sample Output 0

16
Sample Input 1

234
Sample Output 1

279841
===================================================================================================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        /*int r=(int)Math.log(n)+1;*/
        int d=n%10;
         n=(n/10)%100;
        
        System.out.println((int)Math.pow(n,d));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
