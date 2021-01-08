import java.util.Scanner;

class _73_memoryAllocation{

	public static void main(String args[]){

		Scanner input=new Scanner(System.in);

		System.out.print("Enter no elements:");
		int n=input.nextInt();

		int num[]=new int[n];

		System.out.println("Enter values:");


		for(int i=0; i<n; i++){

			num[i]=input.nextInt();
		}

		System.out.println("your values are:");

		int j=0;
		while(j<num.length){

			System.out.println(num[j]);
			j++;
		}

	}
}