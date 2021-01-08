class _8_labeld_break{

	public static void main(String[] args) {
		
		geek:
		for(int i=0; i<5; i++){

			for(int j=0; j<5; j++){
				if(i==3){
					break geek;
				}
				System.out.print("* ");
			}

			System.out.println();

		}//end
	}
}