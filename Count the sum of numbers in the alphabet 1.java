Given a string containing alphanumeric characters, calculate the sum of all numbers present in the string.

Input Format

Read a string

Constraints

string

Output Format

Print Sum of digits in a string

Sample Input 0

1abc23
Sample Output 0

6
  ========================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        int sum=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]>='0'&&ch[i]<='9')
            {
                sum=sum+(ch[i]-48);
            }
        }
        System.out.print(sum);
    }
}
