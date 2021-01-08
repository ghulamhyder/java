import java.util.Scanner;
import java.util.Arrays;
class _2_2D_arr{


	public static void main(String args[]){

		/*[

			[1,2,3],
			[4,5,6],
			[7,8,9]

		]*/

		Scanner input=new Scanner(System.in);
		System.out.print("Enter number of Rows Array:");
		int n=input.nextInt();
		System.out.print("Enter number of Cols Array:");
		int m=input.nextInt();

		int num[][]=new int[n][m];

		for(int i=0; i<n; i++){
			System.out.println("Enter "+m+" values of "+(i+1)+ " Row:");
			for(int j=0;j<m; j++){

				int val=input.nextInt();
				num[i][j]=val;
			}

		}

		for(int myarr[]:num){

			System.out.println(Arrays.toString(myarr));
		}

		
		

	}
}