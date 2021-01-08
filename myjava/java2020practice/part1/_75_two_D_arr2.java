import java.util.Scanner;

class _75_two_D_arr2{


	public static void main(String args[]){

		Scanner input=new Scanner(System.in);

		System.out.print("Enter m size:");
		int m=input.nextInt();

		System.out.print("Enter n size:");
		int n=input.nextInt();

		int num[][]=new int[m][n];

		for(int i=0; i<m; i++){

			System.out.println("Enter values "+(i+1)+" Array");
			for(int j=0; j<n; j++){

				num[i][j]=input.nextInt();

			}

		}//
		System.out.println("your 2D Array: ");
		for(int i=0; i<m; i++){

			
			for(int j=0; j<n; j++){

				System.out.print(num[i][j]+",");

			}
			System.out.println();
		}//
	}
}