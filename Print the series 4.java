0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8 This series is a mixture of 2 series all the odd terms in this series form even numbers in ascending order Every even terms is derived from the previous term using the formula (x/2) Write a program to find the nth term in this series. The value n in a positive integer that should be read from STDIN the nth term that is calculated by the program should be written to STDOUT. Other than the value of the nth term no other characters /strings or message should be written to STDOUT.

Input Format

Read n value

Constraints

1<=n<=10^7

Output Format

print the series

Sample Input 0

10
Sample Output 0

4
Sample Input 1

15
Sample Output 1

14
Sample Input 2

16
Sample Output 2

7
==============================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r1=0,r2=0;
        int t=n;
        int i=1;
        if(n%2==0){
            n=n/2;
            
        }
        else{
            n=n/2;
            n=n+1;
            
        }
        while(i<n){
            r1+=2;
            r2++;
            i++;
            
        }
        if(t%2==0){
        System.out.print(r2);
        }else{
            System.out.print(r1);
        }/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
