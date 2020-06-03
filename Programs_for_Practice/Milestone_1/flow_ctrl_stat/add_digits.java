import java.util.Scanner;

class add_digits{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		int sum;
		for (sum=0;a!=0;a/=10){
			sum+= (a%10);
		}
		System.out.println(sum);
	}
	
}

	
