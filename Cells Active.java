There is a colony of 8 cells arranged in a straight line where each day every cell competes with its adjacent cells(neighbour). Each day, for each cell, if its neighbours are both active or both inactive, the cell becomes inactive the next day,. otherwise itbecomes active the next day. Assumptions: The two cells on the ends have single adjacent cell, so the other adjacent cell can be assumsed to be always inactive. Even after updating the cell state. consider its pervious state for updating the state of other cells. Update the cell informationof allcells simultaneously. Write a fuction cellCompete which takes takes one 8 element array of integers cells representing the current state of 8 cells and one integer days representing te number of days to simulate. An integer value of 1 represents an active cell and value of 0 represents an inactive cell.

Input Format

Enter list of values Enter no of days

Constraints

1<=n<=10*7

Output Format

Print the output based on days

Sample Input 0

1 0 0 0 0 1 0 0
1
Sample Output 0

0 1 0 0 1 0 1 0
Explanation 0

First cell left inactive and right inactive that's why 0 Second cell left active and right inactive that's whay 1 Third cell left inactive and right inactive that's whay 0 Fourth cell left inactive and right inactive that's whay 0 Fifth cell left inactive and right active that's whay 1 Sixth cell left inactive and right inactive that's whay 0 Seventh cell left active and right inactive that's whay 1 Eight cell left inactive and right inactive that's whay 0

for one day

Sample Input 1

1 1 1 0 1 1 1 1
2
Sample Output 1

0 0 0 0 0 1 1 0
==========================================================================================================================================================
Code:
==========================================================================================================================================================
 
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a[]=new int[8];
        for(int i=0;i<8;i++){
            a[i]=s.nextInt();
        }
        int b[]=new int[8];
        int k=s.nextInt();
        
        for(int i=0;i<k;i++){
            int l=a[1];
        int r=a[6];
            for(int j=1;j<7;j++){
                if(a[j-1]==a[j+1]){
                    b[j]=0;
                }
                else{
                    b[j]=1;
                }
            }
            b[0]=l;
            b[7]=r;
            for(int h=0;h<8;h++){
                a[h]=b[h];
            }
            
        }
        
        for(int i=0;i<8;i++){
            System.out.print(a[i]+" ");
            }/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
