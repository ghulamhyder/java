class _86_labeled_break{

	public static void main(String args[]){


		geek:
		for(int i=0; i<5; i++){


			for(int j=0; j<5; j++){

				if(i==3){
					continue geek;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}