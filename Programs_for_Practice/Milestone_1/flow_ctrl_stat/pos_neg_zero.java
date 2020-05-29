import java.util.Scanner;

class pos_neg_zero{
	
	public static void main(String args[])
	{
		int a;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		a=scn.nextInt();
		if(a>0)
		{
			System.out.println("positive");
		}
		else if (a<0)
		{
			System.out.println("negative");
		}
		else
		{
			System.out.println("Zero");
		}
			
	}
}