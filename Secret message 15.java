SecretMessage agency provides message encoding and decoding services for secure data transfer. The first step in decoding includes removal of special characters and the whitespaces from the message, as special characters and whitespaces do not hold any meaning. Write an algorithm to help the agency find the number of special characters and whitespaces in a given message.

Input Format

The input consists of a string message, representing the message that need to be decoded by the agency.

Constraints

string

Output Format

Print an integer representing the number of special characters and whitespaces present in a given message.

Sample Input 0

gasgg54@#vscsd!s*
Sample Output 0

4
Explanation 0

The special characters having no meaning are (‘@’,’#’;’!’,’*’].

Sample Input 1

Thi$ i$ @ top@ floor*
Sample Output 1

5
=============================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        char ch[]=s1.toCharArray();
        int cnt=0;
        for(int i=0;i<ch.length;i++)
        {
            if((ch[i]<'a'||ch[i]>'z')&&(ch[i]<'A'||ch[i]>'Z')&&(ch[i]<'0'||ch[i]>'9')&&ch[i]!=' ')
            {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}
