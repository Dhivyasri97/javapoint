import java.util.*;
class pow
{
public static void main(String args[])
{
int p=1,b,e;
Scanner sc=new Scanner(System.in);
b=sc.nextInt();
e=sc.nextInt();
for(int i=1;i<=e;i++)
{
p=p*b;
}
System.out.println(p);
}
}
