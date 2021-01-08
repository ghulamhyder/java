import java.util.Arrays;
class _2_2D_arr{


	public static void main(String args[]){

		/*[

			[1,2,3],
			[4,5,6],
			[7,8,9]

		]*/

		int num[][]=new int[3][3];

		num[0][0]=11;
		num[0][1]=22;
		num[0][2]=33;

		num[1][0]=44;
		num[1][1]=55;
		num[1][2]=66;

		num[2][0]=77;
		num[2][1]=88;
		num[2][2]=99;

		for(int myarr[]:num){
			System.out.println(Arrays.toString(myarr));
		}
		

	}
}