Bob is doing a research in Pendulum. He is just pushing the pendulum aside and the pendulum started moving in to-and-fro motion. Bob will push the pendulum always towards his right side to start the oscillation. Bob wanted to calculate the distance between extreme position and the centre position of pendulum for each oscillations. He somehow calculated all the possible distance. Since he is busy in this research he is giving the task to his assistant who needs to arrange the values as instructed. Since he is pushing the pendulum to his right always. He wanted to store that distance in the right extreme of the arrangement. And the pendulum will move towards the extreme left at that time he want that value to be stored in the left most extreme in the arrangement. And this continues till the pendulum stops. He is also sure that the distance reached at that oscillation will always be lesser than the previous oscillation towards that particular end.Write a program to arrange the distance as instructed.

Input Format

The first line contains an integer 'N', denoting the size of the input. The next line contains space-separated integers denoting the elements.

Constraints

1<=n<=10^7

Output Format

As per described order

Sample Input 0

5
1 3 2 5 4
Sample Output 0

4 2 1 3 5
Explanation 0

The maximum distance in the given data is 5 hence that is placed in the right most end The next maximum element is 4 which is placed in the left most end. Again the pendulum oscillates towards right to cover a distance of 3 and this continues.

Sample Input 1

10 
100 231 1 487 232 91 80 50 30 10
Sample Output 1

232 100 80 30 1 10 50 91 231 487


    

import java.io.*;

import java.util.*;

​

public class Solution {

    public static void main(String[] args) {

Scanner s=new Scanner(System.in);

   int n=s.nextInt();

    int a[]=new int[n];

   for(int i=0;i<n;i++){

        a[i]=s.nextInt();

    }
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){

            if(a[i]>a[j]&&i!=j){

                int t=a[i];

                a[i]=a[j];
                a[j]=t;

            }
        }

    }
    for(int i=n-2;i>=0;i--){
        System.out.print(a[i]+" ");
        i--;
    }
    if(n%2!=0){
    for(int i=0;i<n;i++){
        {
            System.out.print(a[i]+" ");
            i++;
        }
    }
    }else{
        for(int i=1;i<n;i++){
        System.out.print(a[i]+" ");
            i++;
        }
    }
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */    
    }
}
