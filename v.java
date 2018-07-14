import java.util.*;
public class v{ 
public static void main(String aa[]){
char n;
Scanner s=new Scanner(System.in);
System.out.println("enter char");
n=s.next().charAt(0); 
if((n=='a'||n=='e'||n=='i'||n=='o'||n=='u')||(n=='A'||n=='E'||n=='I'||n=='O'||n=='U')){
System.out.println("vowels");
}
else{
System.out.println("consonants");
}
}
}
