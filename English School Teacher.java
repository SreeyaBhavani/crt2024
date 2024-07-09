An English school teacher is teaching how to build sentences for kindergarten students. She starts by teaching two words in a sentence, then 3 words and so on. The next step is that she asks the students to find which word in the sentence they have made has the maximum number of alphabets. The task here is to write program to find the longest word in each input sentence(str).

Input Format

Read a string

Constraints

string

Output Format

print the highest word length

Sample Input 0

Knowledge is the greatest gift
Sample Output 0

9
Explanation 0

Word No. of characters Knowledge 9 Is 2 The 3 Greatest 8 Gift 4

Sample Input 1

Java is object oriented programming language
Sample Output 1

11
Sample Input 2

11223##%%5566778899 Saturn V rocket���s  first stage carries 203,400 gallons (770,000 litres) of kerosene fuel
Sample Output 2

19
  ==================================================================================================
  import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
 
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String str[]=s1.split(" ");
        int l=0;
        for(int i=0;i<str.length;i++)
        {
            int len=str[i].length();
            if(l<len)
                l=len;
        }
        System.out.print(l);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
