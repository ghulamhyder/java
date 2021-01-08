import java.util.Scanner;
import java.util.Arrays;


class _01_arr1{


	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);


			System.out.print("Enter Rows:");
			int m=input.nextInt();

			System.out.print("Enter Cols:");
			int n=input.nextInt();

			int arr[][]=new int[m][n];

			for(int i=0; i<m; i++){

				for(int j=0; j<n; j++){
					arr[i][j]=input.nextInt();

				}
			}

			





	}
}