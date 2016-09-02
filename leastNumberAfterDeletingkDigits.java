import java.util.*;
public class leastNumberAfterDeletingKDigits{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
char ch[]=String.valueOf(sc.nextInt()).toCharArray();
Arrays.sort(ch);
String str=String.valueOf(ch);
System.out.println(str.substring(0,str.length()-sc.nextInt()));
}
}
