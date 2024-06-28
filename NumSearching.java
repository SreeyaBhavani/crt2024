import java.util.*;
class NumSearching
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int r=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int c=0;
for(int i=0;i<n;i++)
{
if(r==a[i])
{
System.out.println(i);
c=1;
break;
}
}
if(c==0)
{
System.out.println("-1 -1");
}
for(int j=n-1;j>=0;j--)
{
if(r==a[j])
{
System.out.println(j);
c=1;
break;
}
}
}
}

