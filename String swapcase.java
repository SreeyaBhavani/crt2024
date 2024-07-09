Read a stirng and convert upper case into lower case and vice versa

Input Format

Read a string

Constraints

string

Output Format

Print result string

Sample Input 0

Java Language
Sample Output 0

jAVA lANGUAGE
Sample Input 1

pYtHOn Is SIMPLE language
Sample Output 1

PyThoN iS simple LANGUAGE
  ===============================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2="";
        String c="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>=65&&s1.charAt(i)<=90){
            c+=s1.charAt(i);
                String ch=c.toLowerCase();
               s2+= ch;
                c="";
            }
            else{
                c+=s1.charAt(i);
                String ch=c.toUpperCase();
                s2+=ch;
                c="";
            }
        }
        System.out.print(s2);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
