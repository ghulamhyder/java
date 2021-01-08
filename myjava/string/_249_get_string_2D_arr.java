import java.util.Scanner;
import java.util.Arrays;
class _248_get_string_1D_arr{

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		

		System.out.print("Enter number of rows String Array:");
		int rows=input.nextInt();

		System.out.print("Enter number of cols String Array:");
		int cols=input.nextInt();

		String names[][]=new String[rows][cols];

		System.out.print(rows);

		System.out.print(cols);
		System.out.print("Enter values:");
		
		for(int i=0; i<rows; i++){

			for(int j=0; j<cols; j++){

				System.out.println("Enter values, "+i+" array");
				names[i][j]=input.next();
			}
			System.out.println();
		}
		
		for(String val[]:names){

			//for (String val1:val) {
				
				System.out.println( Arrays.toString(val) );
			
		}

		
		

	}
}