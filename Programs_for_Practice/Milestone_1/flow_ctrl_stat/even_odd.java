import java.util.Scanner;

class even_odd{
	public static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		int a;
		a=scn.nextInt();
		
		if (a%2==0){
			System.out.println("even");
		}
		else{
			System.out.println("odd");
		}
	}
}