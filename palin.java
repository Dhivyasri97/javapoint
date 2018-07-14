import java.util.*;
class palin
{
public static void main(String args[])
{
int n,sum=0,b,r,rn=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
b=n;
while(n>0)
{
r=n%10;
sum=sum+r;
rn=rn*10+r;
n=n/10;
}
if(b==rn)
{
System.out.println("yes);
}
else
{
System.out.println("no");
}
}
}
