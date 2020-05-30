import java.util.Scanner;

class color_code{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the color code:");
		
		char code=scn.next().charAt(0);
		
		switch(code){
			case 'R':
					System.out.println(code+"->"+"Red");
					break;
			case 'W':
					System.out.println(code+"->"+"White");
					break;
			case 'B':
					System.out.println(code+"->"+"Blue");
					break;
			case 'O':
					System.out.println(code+"->"+"Orange");
					break;
			case 'Y':
					System.out.println(code+"->"+"Yellow");
					break;
			case 'G':
					System.out.println(code+"->"+"Green");
					break;
			default:
					System.out.println("Invalid Code");
					break;
		}
	}
}
			