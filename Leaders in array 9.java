Given an array of positive integers. Your task is to find the leaders in the array. Note: An element of array is leader if it is greater than or equal to all the elements to its right side. Also, the rightmost element is always a leader.

Input Format

The first line of input contains an integer T denoting the number of test cases. The description of T test cases follows. The first line of each test case contains a single integer N denoting the size of array. The second line contains N space-separated integers A1, A2, ..., AN denoting the elements of the array.

Constraints

1 <= T <= 100 1 <= N <= 107 0 <= Ai <= 107

Output Format

Print all the leaders.

Sample Input 0

6
16 17 4 3 5 2
Sample Output 0

17 5 2
Explanation 0

Testcase 3: All elements on the right of 7 (at index 0) are smaller than or equal to 7. Also, all the elements of right side of 7 (at index 3) are smaller than 7. And, the last element 3 is itself a leader since no elements are on its right.
==============================================================================================================================================================================================
Code:
===============================================================================================================================================================================================
import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
       
        for(int i=0;i<n-1;i++){
            int j=i+1;
            while(j<n&&a[i]>=a[j])
               {
                //c++;
                j++;
            }
            if((n-1-i)==(j-i-1)){
                System.out.print(a[i]+" ");
            }
                
        }
        System.out.print(a[n-1]);
                    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
