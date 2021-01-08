class _45_Escape_sequence{


	public static void main(String args[]){

		/*
			[

			[1,2,3].
			[4,5],
			[7]

			];


		*/

		int num[][]=new int[3][];

		num[0]=new int[3];  
		num[1]=new int[2];
		num[2]=new int[1];

		num[0][0]=11;
		num[0][1]=12;
		num[0][2]=13;

		num[1][0]=21;
		num[1][1]=22;

		num[2][0]=33;

		for(int val1[]:num){

			for(int val:val1){
				System.out.print(val+",");
			}
			System.out.println();
		}
		


		
	}
}