import java.util.*;
class Missingleast
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int i,j;
int n=s.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(i=0;i<n;i++)
{
if(a[i]>0)
{
break;
}
for(j=i;j<n-1;j++)
{
if(a[j]+1!=a[j+1])
{
System.out.println(a[j]+1);
break;
}
if(j==n-1)
{
System.out.println(a[n-1]+1);
}
}
}
}
}




