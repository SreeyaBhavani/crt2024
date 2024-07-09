An e-commerce website wishes to analyze the pre-day sales of their products. The products are tagged from a to z and A to Z. The daily sales are merged into a sequence of the tags of the products sold in the day. The company wishes to identify the products that are purchased only one time in the day. Write an algorithm to find the count of the product tags that occur only once in the sales sequence.

Input Format

The input consists of a string salessequence, representing the sales of the day.

Constraints

string Note: The input string salessequence is case sensitive. Uppercase characters and lowercase characters are counted as different.

Output Format

Print an integer representing the count of the product tags that occur only once in the sales sequence.

Sample Input 0

alphaadida
Sample Output 0

4
Explanation 0

The products tags that occurred once in the sales sequence are l,p,h,i. So the output is 4.

Sample Input 1

PropErformer
Sample Output 1

6
  =====================================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
       Scanner s=new Scanner(System.in);
        String s1=s.next();
        char ch[]=s1.toCharArray();
        int cnt=0;
        for(int i=0;i<ch.length;i++)
        {
            int j=0;
            while(j<ch.length)
            {
                if(ch[i]==ch[j]&&i!=j){
                    break;
                    }
                else{
                    if(j==ch.length-1)
                        cnt++;
                    }
                j++;
            }
        }
        System.out.print(cnt);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
