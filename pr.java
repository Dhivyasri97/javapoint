import java.util.*;
class pr
{
public static void main(String args[])
{
int N,Q,count,n,i;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
Q=sc.nextInt();
for(i=N+1;i<Q;i++)
{
count=0;
for(n=2;n<=i/2;i++)
{
if(i%n==0) 
{
count++;
break;
}
}
if(count==0)
{
System.out.println(i);
}
}
}
}