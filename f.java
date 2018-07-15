import java.util.*;
class f
{
public static void main(String args[])
{
int N,i,fact=1;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
for(i=1;i<=N;i++)
{ 
fact=fact*i;
}
System.out.println(fact);
}
}