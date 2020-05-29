import java.util.Scanner;

class arrange_char{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		char char1=scn.next().charAt(0);
		char char2=scn.next().charAt(0);
		
		int a= (int) char1;
		int b= (int) char2;
		if(a<b){
			System.out.println(char1+","+char2);
		}
		else{
			System.out.println(char2+","+char1);
		}
	}
}
			
		