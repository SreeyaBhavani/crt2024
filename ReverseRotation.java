import java.util.*;
class ReverseRotation{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int k=s.nextInt();
int i;
for(int r=0;r<k;r++)
{
    int t=a[n-1];
    for(i=n-1;i>0;i--)
    {
      a[i]=a[i-1];	
    }
    a[i]=t;
}
for(i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}

