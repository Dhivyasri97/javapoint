import java.util.*;
class sp
{
public static void main(String args[])
{
String n;
int c=0;
Scanner sc=new Scanner(System.in);
n=sc.nextLine();
for(int i=0;i<n.length();i++)
{
if(n.charAt(i)==' ')
{
c++;
}
}
System.out.println(c);
}
}
