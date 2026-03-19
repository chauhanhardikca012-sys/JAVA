class Pattern{
    public static void main(String[] args) {
	
		int i,j;
			
			for (i = 1; i <= 4; i++) { 
				System.out.print("1");   
				for (j = 1; j < i; j++) {
					System.out.print("0");
            }
            if (i > 1) {
                System.out.print("1");
            }
            System.out.println();
        }
    }
}
