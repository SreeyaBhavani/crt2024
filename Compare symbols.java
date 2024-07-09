Problem
Submissions
Leaderboard
Discussions
Given a string S(input consisting) of ‘’ and ‘#’. The length of the string is variable. The task is to find the minimum number of ‘’ or ‘#’ to make it a valid string. The string is considered valid if the number of ‘’ and ‘#’ are equal. The ‘’ and ‘#’ can be at any position in the string.

Input Format

Read a string

Constraints

string

Output Format

(>#): positive integer (#>): negative integer (#=*): 0

Sample Input 0

###***
Sample Output 0

0
Sample Input 1

**###*##*###
Sample Output 1

-4
  =============================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        String s1=s.next();
        char ch[]=s1.toCharArray();
        int star=0,hash=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='#')
                hash++;
            else
                star++;
        }
        System.out.print(star-hash);
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
