import java.util.Scanner;

class prime_num{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int a=scn.nextInt();
		
		for(int i=2;i<=a/2;i++){
			if(a%i ==0){
				System.out.println(a+"is a not prime num");
				break;
			}
			else{
				System.out.println(a+"is a prime num");
				break;
			}
		}
	}
}