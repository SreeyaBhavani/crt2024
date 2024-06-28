Given an array where all elements appear even number of times except one. All repeating occurrences of elements appear in pairs and these pairs are not adjacent (there cannot be more than two consecutive occurrences of any element). Find the element that appears odd number of times. Note that input like {2, 2, 1, 2, 2, 1, 1} is valid as all repeating occurrences occur in pairs and these pairs are not adjacent. Input like {2, 1, 2} is invalid as repeating elements don’t appear in pairs. Also, input like {1, 2, 2, 2, 2} is invalid as two pairs of 2 are adjacent. Input like {2, 2, 2, 1} is also invalid as there are three consecutive occurrences of 2.

Input Format

Read size of the list Read elements of the list

Constraints

1<=n<=10^7

Output Format

Print output

Sample Input 0

7
1 1 2 2 2 3 3
Sample Output 0

2
Explanation 0

It contains three consecutive instances of an element.

Sample Input 1

5
2 2 3 1 1
Sample Output 1

3
Explanation 1

It contains two consecutive instances of two elements and one odd number of times.
====================================================================================================
Code:
====================================================================================================

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
          int  c=0;
           while(a[i]==a[i+1]){
                c++;
               i++;
            }
            if(c%2==0){
                System.out.print(a[i]);
                return;
            }
        }/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
