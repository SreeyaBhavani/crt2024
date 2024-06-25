import java.util.*;
class Sum{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
/*int t=0;
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++){
t=t+1;
}
}*/
System.out.println(n*(n+1)/2);
}
}