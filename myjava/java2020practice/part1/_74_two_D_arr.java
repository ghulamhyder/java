class _45_Escape_sequence{


	public static void main(String args[]){


		int num[][]=new int[3][3]; //[rows][cols]

		/*[

			[1,2,3],
			[4,5,6],
			[7,8,9]
		]*/

		num[0][0]=11;
		num[0][1]=22;
		num[0][2]=33;

		num[1][0]=44;
		num[1][1]=55;
		num[1][2]=66;

		num[2][0]=77;
		num[2][1]=88;
		num[2][2]=99;
		for(int i=0; i<num.length; i++){

			for(int j=0; j<num[1].length; j++){

				System.out.print(num[i][j]+",");
			}
			System.out.println();
		}


	}
}