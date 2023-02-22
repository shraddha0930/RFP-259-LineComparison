package assignments.LineComparison;

import java.util.Scanner;

public class LineComparison
{
	public static void main(String args[])
	{
		System.out.println("Welcome To Line Comparison Computation Program on Master Branch");
		Long x1,x2,y1,y2;
		Long L1, L2;

		//double Length;

		Scanner sc=new Scanner(System.in);

		System.out.println("enter x1 point");

		x1=sc.nextLong();

		System.out.println("enter y1 point");

		y1=sc.nextLong();

		System.out.println("enter x2 point");

		x2=sc.nextLong();

		System.out.println("enter y2 point");

		y2=sc.nextLong();

		//Length=Math.sqrt((x2-x1)^2 + (y2-y1)^2);

		//System.out.println("Distance between"+"("+x1+","+y1+"),"+"("+x2+","+y2+"):"+Length);

		L1 = x2 - x1;
		L2 = y2 - y1;

//		if(L1.equals(L2))
//			System.out.println("Both length are equal");
//		else
//			System.out.println("Both length are not equal");

		System.out.println(L1.compareTo(L2));

	}
}