import java.util.Scanner;
import java.util.Arrays;
class _04_jagedArr{


	public static void main(String[] args) {

		

		Scanner input=new Scanner(System.in);

		System.out.print("enter cols of Arr:");
		int n=input.nextInt();
		int arr[][]=new int[3][n];

		for(int i=0; i<arr.length; i++){

			System.out.println("Enter value ("+(i+1)+") arr:");
			for(int j=0; j<n; j++){

				System.out.print("arr["+i+"]["+j+"]=");
				arr[i][j]=input.nextInt();
			}
		}

		for(int val[]:arr){

			System.out.println(Arrays.toString(val));
		}

		
	}
}