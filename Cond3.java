import java.util.*;
class Cond3{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
float c=(float)(a/b);
if(b==0)
System.out.println(+a+" and "+a+"cant be divided");
else
System.out.println("The result is "+c);
}
}
