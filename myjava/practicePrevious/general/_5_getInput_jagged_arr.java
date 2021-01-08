import java.util.Scanner;
import java.util.Arrays;
class _5_getInput_jagged_arr{


	public static void main(String args[]){

	Scanner input = new Scanner(System.in);

	System.out.print("enter number of rows array:");
	int n=input.nextInt();

	int arr[][]=new int[n][];

	

	for(int i=0; i<n; i++){

		System.out.print("enter number of cols of Row "+(i+1)+":" );
		int m=input.nextInt();

		 arr[i]=new int[m];

	}

	for(int i=0; i<arr.length; i++){

		String ltr=null;
		 if(arr[i].length==1){
		 	ltr="value";
		 } else {
		 	 ltr="values";
		 }

		System.out.println("enter "+arr[i].length+" "+ltr +" of Row "+(i+1)+":" );

		for(int j=0; j<arr[i].length; j++){

		int m=input.nextInt();
		arr[i][j]=m;

	}

		 

	}

	for(int val[]:arr){
		System.out.println(Arrays.toString(val));
	}
	
		

	}
}