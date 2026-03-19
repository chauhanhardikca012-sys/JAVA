class Leap{
	public static void main(String[] args){
		int year = 2024;
		
			if(((year %4==0)&&(year %100!=0))||(year %400==0)){
						System.out.print("This is Leap Year");
			}else{
				System.out.print("This is Not Leap Year");
			}
	}
}