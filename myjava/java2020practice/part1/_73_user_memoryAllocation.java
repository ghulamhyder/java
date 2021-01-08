import java.util.Scanner;
import java.lang.*;

class _45_Escape_sequence{


	public static void main(String args[]){

		Scanner input=new Scanner(System.in);

		System.out.println("enter num for size of array:");
		int n=this.nextInt();
		int num[]=new int[n];

		Test obj=new Test();
		int arr[]=obj.func(num,n);
		for (int i=0; i<arr.length; i++ ) {
			System.out.println(arr[i]);
		}


		
	}
}

class Test {

	public int[] func(int[] num,int n){

		Scanner input=new Scanner(System.in);
		System.out.println("Enter "+n+" values");
		for(int i=0; i<n; i++){

			num[i]=input.nextInt();
		}
		return num;

	}
}
