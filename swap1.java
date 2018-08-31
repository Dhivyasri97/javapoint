import java.util.*;
class swap1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m,n;
m=sc.nextInt();
n=sc.nextInt();
m=m+n;
n=m-n;
m=m-n;
System.out.println(m+" "+n);
}
}
