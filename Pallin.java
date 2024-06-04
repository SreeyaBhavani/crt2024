import java.util.Scanner;
class Pallin{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int sum=0,temp,r;
temp=a;
while(a>0)
{
r=a%10;
sum=(sum*10)+r;
a=a/10;
}
if(temp==sum)
System.out.println("Pallindrome");
else
System.out.println("not Pallindrome");
}
}