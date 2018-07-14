import java.util.*;
class l
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter no");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if(a>b&&a>c)
{
System.out.println(a);
}
else if(b>a&&b>c)
{
System.out.println(b);
}
else if(c>a&&c>b)
{
System.out.println(c);
}
else
{
System.out.println("enter no");
}
}
}