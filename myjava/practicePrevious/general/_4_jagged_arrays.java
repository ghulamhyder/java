import java.util.Arrays;
class _4_jagged_arrays{


	public static void main(String args[]){

	
		int arr[][]=new int[3][];  //Row * Col //jagged arrays


			arr[0]=new int[3];
			arr[1]=new int[2];
			arr[2]=new int[1];

			arr[0][0]=11;
			arr[0][1]=22;
			arr[0][2]=33;

			arr[1][0]=44;
			arr[1][1]=55;

			
			arr[2][0]=66;


		for(int val[]:arr){

			System.out.println(Arrays.toString(val));
		}
	
		

	}
}