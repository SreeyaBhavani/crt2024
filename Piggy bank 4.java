A family is about to break their piggy bank to use the money for different purposes. The piggy bank here represents an array (arr[]) consisting of N coins. The family has to split the coins of piggy bank into smaller stack (sub-array) of coins such that the sum of the difference between the maximum value and the minimum value of the coins for all the stacks (sub-arrays) is maximum. Note: Each value of the array can be used only once that is only in one subarray.

Input Format

Read size of the list Read elements of the list

Constraints

1 <= N <= 500 1 <=arr[i] <= 100

Output Format

print output

Sample Input 0

5
8 1 7 9 2
Sample Output 0

14
Explanation 0

Let us break the array elements into following subarrays: 1. (8,1) → Max:8 Min:1 2. (7,9,2) → Max:9 Min:2 So, the difference between the maximum and minimum elements in each subarrays is 1. 8-1=7 2.9-2=7 Now, the sum of the differences of subarray is: 7+7=14 Hence, output is 14.

Sample Input 1

5
1 2 1 0 5
Sample Output 1

6
Explanation 1

Let us break the array elements into following subarrays: 1. (1,2,1) → max:2, min:1 2. (0,5) → max:5, min:0 So, the difference between the max and min elements in each subarray is 1. 2-1 = 1 2. 5-0 = 5 Now, the sum of the differences of subarraya is: 1+5 = 6 Hence, output is 6.
======================================================================================================================================================================================================================
Code:
======================================================================================================================================================================================================================

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
        int m=n/2;
        int b1[]=new int[m];
        int b2[]=new int[n-m];
        for(int i=0;i<m;i++){
            b1[i]=a[i];
        }
        int k=0;
        for(int i=m;i<n;i++){
            b2[k++]=a[i];
        }
        Arrays.sort(b1);
        Arrays.sort(b2);
        int d1=b1[m-1]-b1[0];
        int d2=b2[n-m-1]-b2[0];
        System.out.print(d1+d2);/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
