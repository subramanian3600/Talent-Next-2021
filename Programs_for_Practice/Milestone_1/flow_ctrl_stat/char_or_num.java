import java.util.Scanner;

class char_or_num{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		char a =scn.next().charAt(0);
		if(Character.isLetter(a)){
			System.out.println("Alphabets");
		}
		else if(Character.isDigit(a)){
			System.out.println("Number");
		}
		else{
			System.out.println("Special charcter");
		}
	}
}
		