import java.util.*;
class Quadratic{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
float d=(float)(b*b-a*a*c);
if(d<0)
System.out.println("Roots are Imaginary");
else
float r1=(float)((-b+Math.sqrt(d))/2*a*c);
float r2=(float)((-b-Math.sqrt(d))/2*a*c);
System.out.prinltn(+r1+" and "+r2+" are the roots");
}
}