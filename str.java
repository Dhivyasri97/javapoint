import java.util.*;
class str
{
public static void main(String args[])
{
String n;
int c=0;
Scanner sc=new Scanner(System.in);
n=sc.nextLine();
String s[]=n.split("\\s+");
for(int i=0;i<s.length;i++)
{
c++;
}
System.out.println(c);
}
}
