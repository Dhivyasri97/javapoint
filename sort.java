import java.util.*;
class sort
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
for(int i=0;i<n;i++)
{
System.out.print(a[i]);
}
}
}
