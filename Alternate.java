import java.util.*;
class Alternate{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n/2;i++){
System.out.print(a[n-1-i]+" "+a[i]+" ");
}
if(n%2==1)
{
System.out.print(a[n/2]);
}
}
}

