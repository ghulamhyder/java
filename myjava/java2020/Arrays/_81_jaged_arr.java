
class _81_jaged_arr{


	public static void main(String args[]){


		
		//int num[][]=new int[3][];
		//or 
		int[][] num=new int[3][];

		num[0]=new int[3];
		num[1]=new int[2];
		num[2]=new int[1];

		num[0][0]=11;
		num[0][1]=22;
		num[0][2]=33;

		num[1][0]=44;
		num[1][1]=55;

		num[2][0]=66;

		/*System.out.println("main Arra size="+num.length);
		System.out.println("arr1 size="+num[0].length);
		System.out.println("Arra2 size="+num[1].length);
		System.out.println("Arra3 size="+num[2].length);*/

		for(int i=0; i<num.length; i++){

			for(int j=0; j<num[i].length; j++){

				System.out.print(num[i][j]+",");
			}
			System.out.println();
		}
		
	}
}