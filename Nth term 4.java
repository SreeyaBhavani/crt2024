Given a number N, write a program to find the Nth term of the below-mentioned series. 14, 28, 20, 40, 32, 64, 56, 112, 104, 208.....

Input Format

Read n value

Constraints

1<=n<=10000

Output Format

Print nth term

Sample Input 0

2
Sample Output 0

28
Sample Input 1

10
Sample Output 1

208
==================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=14,b=28;
        int h=6,k=12;
        if(n==1){
            System.out.print(a);
            return;
        }
        if(n==2){
            System.out.print(b);
            return;
        }
        for(int i=1;i<n/2;i++){
            a=a+h;
            b=b+k;
            h=h*2;
            k=k*2;
        }
        if(n%2==0){
            
            System.out.print(b);
        }
        else{
            a=a+h;
            System.out.print(a);
        }/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
