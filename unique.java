import java.util.*;
public class main1
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	s.replaceAll(",","");
	for(int i=0;i<s.length();i++)
	if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
		System.out.println(s.charAt(i));
}
}
