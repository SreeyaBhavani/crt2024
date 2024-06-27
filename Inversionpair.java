/*input:7
         13 10 9 6 21 15 14
  output:
         9
============================================================*/
import java.util.*;
class Inversionpair
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
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
c++;
}
}
}
System.out.println(c);
}
}
