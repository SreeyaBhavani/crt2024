import java.util.*;
class Sunrise{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
int c=1,large=a[0];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=1;i<n;i++)
{
if(large<=a[i])
{
c++;
}
}
System.out.println(c);
}
}

