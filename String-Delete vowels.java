Write a program to delete the vowels in the given string and display the string without vowels.

Input Format

Read a string

Constraints

string

Output Format

Print string without vowels

Sample Input 0

java
Sample Output 0

jv
Sample Input 1

python
Sample Output 1

pythn
  =======================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
            {
                continue;
            }
            else
            {
                System.out.print(ch[i]);
            }
        }
     /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
