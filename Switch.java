import java.util.*;
class Switch{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
switch(s.nextInt())
{
case 1:
System.out.println(a+b);
break;
case 2:
System.out.println(a-b);
break;
case 3:
System.out.println(a*b);
break;
case 4:
System.out.println(a/b);
break;
case 5:
System.out.println(a%b);
break;
default:
System.out.println("Invalid");
}
}
}