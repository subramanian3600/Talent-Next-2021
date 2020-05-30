class prime_num_10to99{
	public static void main(String[] args){
		
		for(int i=10;i<99;i++){
			for(int j=2;j<=i;){
				if(i%j ==0){
					break;
				}
				else{
					System.out.println(i);
				    break;
				}
			}
		}
	}
}