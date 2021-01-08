import java.util.Scanner;

class _74_two_D_arr{



	public static void main(String args[]){

	
		Scanner input=new Scanner(System.in);

		System.out.println("Enter Number rows:");
		int rows=input.nextInt();
		System.out.println("Enter Number Columns:");
		int cols=input.nextInt();
		int num[][]=new int[rows][cols];

		System.out.println("Enter Values:");
		for(int i=0; i<rows; i++){

			for(int j=0; j<cols; j++){
				
				System.out.println("hello"+i);
				num[i][j]=input.nextInt();
			}
			
			
		}
		for(int x=0; x<rows; x++){

			for(int y=0; y<cols; y++){
				
				System.out.print(num[x][y]+",");
			}
			
			System.out.println();
		}



		
	}
}