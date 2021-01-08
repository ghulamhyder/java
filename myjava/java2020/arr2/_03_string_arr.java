import java.util.Scanner;
import java.util.Arrays;

class _03_string_arr{


	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		System.out.print("Enter Rows:");
		int m=input.nextInt();

		System.out.print("Enter Cols:");
		int n=input.nextInt();

		String arr[][]=new String[m][n];

		for(int i=0; i<m; i++){
			System.out.println("Enter arr1("+(i+1)+")values");

			for(int j=0; j<n; j++){

				arr[i][j]=input.next();

			}
		}
		for(String val[]:arr){

			System.out.println(Arrays.toString(val));
		}

			
	}
}