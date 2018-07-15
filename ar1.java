import java.util.*;
class ar1
{
public static void main(String args[])
{
int N,Q,r,s=0,i,no;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
Q=sc.nextInt();
for(i=N+1;i<=Q;i++)
{
no=i;
while(no>0)
{
r=no%10;
s+=r*r*r;
no=no/10;
}
if(no==s)
{
System.out.println(s);
}
}
}
}

