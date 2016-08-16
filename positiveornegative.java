import java.util.*;
import java.lang.*;
import java.io.*;
class norp
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
		System.out.println("positive number");
		else if(n<0)
		System.out.println("negative number");
		else
		System.out.println("zero");
	}
}
