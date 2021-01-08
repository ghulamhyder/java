import java.util.Scanner;

class _82_inputJaged_arr{


	public static void main(String args[]){

		Scanner input=new Scanner(System.in);

		System.out.print("enter size of jagged arr:");
		int m=input.nextInt();

		int num[][]=new int[m][];
		
		for(int i=0; i<m; i++){
			System.out.print("enter size "+(i+1)+ " array");

			num[i]=new int[input.nextInt()];
	}
	for(int i=0; i<num.length; i++){

			System.out.println("enter values "+(i+1)+" array");
		
			
			for(int j=0; j<num[i].length; j++){

				num[i][j]=input.nextInt();

			}
}

	for(int val1[]:num){

		for(int elem:val1){
			System.out.print(elem+",");
		}
		System.out.println();
	}


}//func
}//class
