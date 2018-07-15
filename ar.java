import java.util.*;
class ar
{
public static void main(String args[])
{
int n,sum=0,r,no;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
no=n;
while(n>0)
{
r=n%10;
sum+=r*r*r;
n=n/10;
}
if(no==sum)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}