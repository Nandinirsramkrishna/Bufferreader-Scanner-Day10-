package day10;
import java.io.*;
import java.lang.*;
import java.util.*;
class scanner
{
	public void add()
	{
		
				int n1,n2,sum;
				Scanner sc = new Scanner(System.in);
				System.out.println("enter first number");
				n1=sc.nextInt();
				System.out.println("enter second number");
				n2=sc.nextInt();
				sc.close();
				sum=n1+n2;
				System.out.println("sum of the number"+sum);
	}
	public void product()
	{
		int n1,n2,prd;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number");
		n1=sc.nextInt();
		System.out.println("enter second number");
		n2=sc.nextInt();
		sc.close();
		prd=n1*n2;
		System.out.println("sum of the number"+prd);
	}
}
public class Inputdemo
{
public static void main(String args[]) throws IOException
{
	int x,y;
	InputStreamReader is =new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(is);
	
	System.out.println("Br enter first number:");
	x=Integer.parseInt(br.readLine());
	
	System.out.println("Br enter second number:");
	y=Integer.parseInt(br.readLine());
	int s=x+y;
	int p=x*y;
	System.out.println("sum:"+s+"\nproduct:"+p); // printing the sum and product

}
}

