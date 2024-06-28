Given an integer n, write a program that returns "yes" if binary representation of n is palindrome else return "no".

Input Format

Read a number

Constraints

1<=n<=10000

Output Format

print yes or no

Sample Input 0

9
Sample Output 0

yes
Explanation 0

9 binary value is 1001
1001 is palindrome that's why output is "yes"

Sample Input 1

123
Sample Output 1

no
Explanation 1

123 binary value is 1111011
That's why output is "no"
===========================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[100];
        
        int i=0;
        while(n>0){
            int x=n%2;
            a[i++]=x;
            n=n/2;
        }
       int b[]=new int[i];
        int k=0;
        for(int j=i-1;j>=0;j--){
            b[k++]=a[j];
        }
        int h=0;
        while((h<i)&&(a[h]==b[h])){
            
            
            h++;
        }
        if(i==h){
            System.out.print("yes");
        }
        else{
            System.out.print("no");
        }    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
