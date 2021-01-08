import java.util.Scanner;


class _82_inputJaged_arr{

	public static void main(String args[]){

		Scanner input=new Scanner(System.in);


		System.out.print("Enter Array Size:");
		int m=input.nextInt();
		int arr[][]=new int[m][];

		
		for(int i=0; i<m; i++){

			System.out.println("Enter child array size "+(i+1)+":");

			int n=input.nextInt();

			arr[i]=new int[n];	
		}


		

		for(int x=0; x<arr.length; x++){
			int val=0;
			System.out.println("Enter vlaues:"+(x+1)+" array");

			for(int y=0; y<arr[x].length; y++){

				val=input.nextInt();
				arr[x][y]=val;
			}
		}

		for(int p=0;p<arr.length;p++){
			for(int q=0;q<arr[p].length;q++){

				System.out.print(arr[p][q]+",");
			}
			System.out.println();
		}


	}
}