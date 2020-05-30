class intrst_m_f{
	public static void main(String[] args){
		String sex=args[0];
		int age=Integer.parseInt(args[1]);
		
		if(age <1 || age>120){
			System.out.println("invalid age");
		}
		else if((sex.equals( "male")) && (age >= 1 && age <= 60)){
			System.out.print("Interest: 9.2%");
		}
		else if((sex.equals ( "male")) && (age >60 && age <= 120)){
			System.out.print("Interest: 8.3%");
		}
		else if((sex.equals ("female")) && (age >= 1 && age <= 58)){
			System.out.print("Interest: 8.2%");
		}
		else if((sex.equals ("female")) && (age >58 && age <= 120)){
			System.out.print("Interest: 7.6%");
		}
	}
}	
					
			
			
			
			
			
			
