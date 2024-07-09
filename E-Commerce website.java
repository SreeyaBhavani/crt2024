The delivery requests of an e-commerce website are depicted in the form of strings tagged ‘a-z’ or ‘A-Z’. Each character of the string represents the number of products that need to be delivered for that respective code. Due to limited delivery windows the website has decided to deliver the products whose codes represents the largest and the smallest values in the string. The company needs to find out the total number of products delivered. Write an algorithm to find out the total number of products delivered.

Input Format

The input consists of a string – requestString, represented the delivery request.

Constraints

string

Output Format

Print an integer representing the total number of products delivered.

Sample Input 0

aAkliP
Sample Output 0

173
Explanation 0

The ASCII value of the characters in the string are as follows: a=97 A=65 k=107 l=108 i=105 P=80 The sum of smallest and the largest ascii values is 65+108=173 Hence the output is 173.

Sample Input 1

PYthon
Sample Output 1

196
  ================================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        char low,high;
        for(int i=0;i<ch.length-1;i++)
        {
            if((ch[i]>=65&&ch[i]<=90)||(ch[i]>=97&&ch[i]<=122))
                if(ch[i]>ch[i+1]){
                    char t=ch[i];
                    ch[i]=ch[i+1];
                    ch[i+1]=t;
        }
       }
        System.out.print(ch[0]+ch[ch.length-1]);
    }
}
