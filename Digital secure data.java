The company Digital Secure Data Transfer Solutions provides data encryption and data sharing services. Their process uses a key K for encryption when transmitting characters. To encrypt a character, the character is replaced by the following Kth character with the same case in the English alphabet set. The English alphabetical set is considered in a cyclic fashion for the last K characters. Write an algorithm to find the character used to encrypt the given character.

Input Format

The input consists of a space-separated character and integer – character and key, representing the character to be transmitted, and the key (K), respectively.

Constraints

NA

Output Format

Print a character representing the encrypted character.

Sample Input 0

D
3
Sample Output 0

G
Explanation 0

Replace D with G. So, the output is G.

Sample Input 1

b
29
Sample Output 1

e
Sample Input 2

E
110
Sample Output 2

K
  =============================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        char ch=s.next().charAt(0);
        int k=s.nextInt();
         if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
        {
          System.out.print((char)(ch+k%26));  
        }
    }
}
