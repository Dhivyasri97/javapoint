import java.util.*;
class od
{
public static void main(String args[])
{
int N,Q;
Scanner sc=new Scanner(System.in);
N=sc.nextInt();
Q=sc.nextInt();
for(int i=N;i<=Q;i++)
{
if(i%2!=0)
{
System.out.println(i);
}
}
}
}