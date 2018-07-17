import java.util.*;
class min
{
public static void main(String args[])
{
int n,c;
ArrayList<Integer>a=new ArrayList<Integer>();
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
c=sc.nextInt();
a.add(c);
}
System.out.println(Collections.min(a));
}
}
