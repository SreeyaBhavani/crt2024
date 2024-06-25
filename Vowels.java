import java.util.*;
class Vowels{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if(c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' ||c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u')
{
System.out.printf("%c is vowel",c);
}
else
{
System.out.printf("%c is consonant",c);
}
}
}