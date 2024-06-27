import java.util.*;
class MErge{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int m=s.nextInt();
int b[]=new int[m];
for(int j=0;j<m;j++)
{
b[j]=s.nextInt();
}
int c[]=new int[n+m];
int i=0,j=0,k=0;
while(i<n && j<m)
{
if (a[i]<b[j])
{
c[k]=a[i];
i++;
k++;
}
else
{
c[k]=b[j];
j++;
k++;
}
}
while(i<n)
{
c[k]=a[i];
i++;
k++;
}
while(j<m)
{
c[k]=b[j];
j++;
k++;
}
for(i=0;i<k;i++)
{
System.out.print(c[i]+" ");
}
}
}
