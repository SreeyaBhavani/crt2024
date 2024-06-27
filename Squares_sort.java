/*input:5
        -4 -1 0 3 10
  output:
         16 1 0 9 100

============================================================*/
import java.util.*;
class Squares_sort
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int c=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int b[]=new int[n];
for(int i=0;i<n;i++)
{
b[i]=(a[i]*a[i]);
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
System.out.print(b[i]+" ");
}
}
}
