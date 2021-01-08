class _87_labeled_continue{

	public static void main(String args[]){

		hyder:
		for(int i=0; i<5; i++){


			for(int j=0; j<5; j++){

				if(i==3){
					continue hyder;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}