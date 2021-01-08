import java.util.Scanner;

class _01_string1{

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		System.out.print("enter m value");
		int m=input.nextInt();
		System.out.print("enter n value");
		int n=input.nextInt();
		String name[][]=new String[m][n];

		

		for (int i=0;i<m ;i++ ) {
			
			for(int j=0;j<n; j++){
				name[i][j]=input.nextLine();
			}


		}

		for(String val[]:name){

			for(String ltr:val){
				System.out.println(ltr);
			}
		}


	}
}