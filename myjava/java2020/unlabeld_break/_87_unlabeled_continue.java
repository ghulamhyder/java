class _87_unlabeled_continue{

	public static void main(String args[]){


		for(int i=0; i<5; i++){


			for(int j=0; j<5; j++){

				if(i==3){
					continue;
				}
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}