import java.util.Scanner;
import java.util.Arrays;

class Myclass {


	public static void main(String args[]){

		
		Scanner input=new Scanner(System.in);

		System.out.print("Enter Array size:");

		int n=input.nextInt();
		int arr[]=new int[n];
		


		for(int i=0; i<n; i++){

			System.out.print("Enter "+(i+1) +" value:" );

			int val=input.nextInt();

			arr[i]=val;
			//System.out.println(arr[i]);
		}

		System.out.println(Arrays.toString(arr));
	}
}