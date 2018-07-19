import java.util.*;
class count
{
public static void main(String args[])
{
String n;
int count=0;
Scanner sc=new Scanner(System.in);
n=sc.nextLine();
for(int i=0;i<n.length();i++)
{
if(n.charAt(i)!=' ')
{
count++;
}
}
System.out.println(count);
}
}