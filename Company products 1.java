A company has to tag its products. Each product has an associated product type which is used to tag the products. Product type is a sequence of lower-case letters from the English alphabet. The company want to have an algorithm for their system which takes the product type and outputs the tag. To generate the tag, pairs of adjacent characters are formed from the start of the uct type . From each pair the lexicographically smallest character will be removed. If a character will be left unpaired then that character will be taken as it is in the tag. Write an algorithm for the company system to find the tag for the given product.

Input Format

The input consists of a string productType. representing the product type of the product.

Constraints

string

Output Format

Print a string representing the tag for the given product

Sample Input 0

electronics
Sample Output 0

letois
Sample Input 1

language
Sample Output 1

lnug
  ===============================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]<ch[i+1])
            {
                System.out.print(ch[i+1]);
                i++;
            }
            else if(ch[i]>ch[i+1])
            {
                System.out.print(ch[i]);
                i++;
            }
        }
        if(ch.length%2!=0)
            System.out.print(ch[ch.length-1]);

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
