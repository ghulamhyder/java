class _74_two_D_arr{



	public static void main(String args[]){

		int num[][]={ {1,2,3,4},{5,6,7,8},{9,10,11,12} };
		//int num[][]=new int[3][4];
		//System.out.println(num[0].length);

		int x;

		for(int i=0; i<num.length; i++){
			x=0;

			for(int j=0; j<num[i].length;j++){

				x=num[i][j];
				System.out.println(x + ",");
			}
			System.out.println();
		}
	}
}