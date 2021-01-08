import java.util.Scanner;

class _45_Escape_sequence{


	public static void main(String args[]){

		Scanner input=new Scanner(System.in);

		
		int num[]=new int[5];
		System.out.print("Enter 5 values:");

		for(int i=0; i<5; i++){

			num[i]=input.nextInt();

		}

		System.out.println();
		for(int i=0; i<5; i++){

			if(i==2){
				num[i]=num[0]+num[1];
			}
			if(i==3){
				num[i]=num[0]+num[2];
			}
			System.out.println(num[i]);

		}
		
	}
}