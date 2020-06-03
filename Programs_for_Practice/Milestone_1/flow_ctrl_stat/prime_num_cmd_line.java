class prime_num_cmd_line{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
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