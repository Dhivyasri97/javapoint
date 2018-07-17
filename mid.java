import java.util.*;
class mid
{
public static void main(String args[])
{
int n,c;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
int y=n/2;
for(int i=0;i<n;i++)
{
if(i==y)
{
System.out.print(a[i]);}
}
}
}
