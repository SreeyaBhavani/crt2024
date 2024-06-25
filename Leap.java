import java.util.*;
class Leap{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int y=s.nextInt();
if(y%4==0 && (y%100!=0 ||y%400==0))
System.out.println(+y+" is leap year");
else
System.out.println(+y+" is not leap year");
}
}