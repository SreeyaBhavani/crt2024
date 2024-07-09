These days kids are introduced to computers at a very early age. The kids are taught about alphabets, digits and blank spaces. The teacher asked the students to count the vowels, consonants, digits and white spaces in a string. The teacher found it a bit difficult to evaluate these tests and she knew that the 12th class students are learning C programming. So she assigned this task to them to count the vowels, consonants, digits and white spaces in a string. Can you please help them out? Write a program to count the vowels, consonants, digits, white spaces, and symbols in a string.

Input Format

Input consists of a string.

Constraints

Assume the maximum length of the string is 200.

Output Format

print the results

Sample Input 0

This program is very easy 2 complete
Sample Output 0

Vowels:10
Consonants:19
White Spaces:6
Digits:1
Symbols:0
Sample Input 1

Java is 2 cre@te 4r NORMAL & web apps.
Sample Output 1

Vowels:9
Consonants:16
White Spaces:8
Digits:2
Symbols:3
=====================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String st=s.nextLine();
        String st1=st.toLowerCase();
        int v=0,co=0,w=0,d=0,sy=0;
        for(int i=0;i<st.length();i++){
            char c=st1.charAt(i);
            if(c>=97&&c<=122){
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    v++;
                }
                else{
                    co++;
                }
            }
            else if(c==' '){
                w++;
            }
            else if(c>=48&&c<=57){
                d++;
            }
            else{
                sy++;
            }
        }
        System.out.println("Vowels:"+v+"\nConsonants:"+co+"\nWhite Spaces:"+w+"\nDigits:"+d+"\nSymbols:"+sy);
    }
}
