Two cats and a mouse are at various positions on a line. You will be given their starting positions. Your task is to determine which cat will reach the mouse first, assuming the mouse doesn’t move and the cats travel at equal speed. If the cats arrive at the same time, the mouse will be allowed to move and it will escape while they fight. You are given q queries in the form of x ,y and ,z representing the respective positions for cats A and B and for mouse C . Complete the function catAndMouse to return the appropriate answer to each query, which will be printed on a new line.

If cat A catches the mouse first, print Cat A. If cat B catches the mouse first, print Cat B. If both cats reach the mouse at the same time, print Mouse Cas the two cats fight and mouse escapes. For example, cat A is at position x=2 and cat B is at y=5 . If mouse C is at position z=4,It is 2 units from cat A and 1 unit from cat B. Cat B will catch the mouse.

Function Description Complete the catAndMouse function in the editor below. It should return one of the three strings as described.

catAndMouse has the following parameter(s): x: an integer, Cat A‘s position y: an integer, Cat B’s position z: an integer, Mouse C‘s position

Input Format

The first line contains a single integer q, denoting the number of queries. Each of the q subsequent lines contains three space-separated integers describing the respective values of x (catA ‘s location) ,y (catB ‘s location), and z (mouse C’s location).

Constraints

1<=n<=10^7

Output Format

For each query, return Cat A if cat A catches the mouse first, Cat B if cat B catches the mouse first, or Mouse C if the mouse escapes.

Sample Input 0

2
1 2 3
1 3 2
Sample Output 0

Cat B
Mouse C
Sample Input 1

3
2 8 3
6 2 4
7 1 5
Sample Output 1

Cat A
Mouse C
Cat A
==========================================================================================================================
Code:
==========================================================================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();
        for(int h=0;h<t;h++){
        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();
        int i=0,j=0;
        if(x>z){
           i=x-z;
        }else{
            i=z-x;
        }
        if(y>z){
            j=y-z;
        }
        else{
            j=z-y;
        }
        if(i>j){
           System.out.print("Cat B\n"); 
        }
        else if(j>i){
            System.out.print("Cat A\n");
        }
        else{
            System.out.print("Mouse C\n");
        }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
