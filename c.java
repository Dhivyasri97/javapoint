import java.util.*;
class c
{
public static void main(String args[])
{
int n,c=0;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
while(n>0)
{
n=n/10;
c++;
}
System.out.println(c);
}
}