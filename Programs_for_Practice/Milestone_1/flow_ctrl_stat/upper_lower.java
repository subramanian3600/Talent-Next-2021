import java.util.Scanner;

class upper_lower{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		char char1=scn.next().charAt(0);
		int n;
		char temp=char1;
		if(Character.isUpperCase(char1)){
			n=(int) char1;
			n=n+32;
			char1=(char) n;
		}
		else{
			n=(int) char1;
			n=n-32;
			char1=(char) n;
		}
		System.out.println(temp+"->"+char1);
	}
}
		
