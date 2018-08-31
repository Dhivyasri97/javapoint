import java.util.*;
class para
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String a;
int count=0;
a=sc.nextLine();
String b[]=a.split("\\.");
for(int i=0;i<b.length;i++)
{
count++;
}
System.out.println(count);
}
}