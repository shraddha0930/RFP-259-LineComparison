package assignments.LineComparison;

import java.util.Scanner;

public class LineComparison
{
	public static void main(String args[])
	{
		System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
		int x1,x2,y1,y2;

		double Length;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter x1 point");

		x1=sc.nextInt();

		System.out.println("enter y1 point");

		y1=sc.nextInt();

		System.out.println("enter x2point");

		x2=sc.nextInt();

		System.out.println("enter y2 point");

		y2=sc.nextInt();

		Length=Math.sqrt((x2-x1)^2 + (y2-y1)^2);

		System.out.println("Distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+"):"+Length);

	}
}