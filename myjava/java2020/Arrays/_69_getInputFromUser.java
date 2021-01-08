import java.util.Scanner;

class _69_getInputFromUser{

	public static void main(String args[]){

		Scanner input=new Scanner(System.in);

		System.out.println("enter 5 integer values:");
		int num[]=new int[5];
		//int i=0;
		/*for(int i=0; i<5; i++){
			num[i]=input.nextInt();
		}*/

		/*while(i<5){
			num[i]=input.nextInt();
			i++;
		}*/

		int i=0;
		do{

			num[i]=input.nextInt();
			i++;
		} while(i<5);


		System.out.println("you have enter values:");
		for(int j=0; j<num.length; j++){
			
			System.out.println(num[j]);
		}
	}
}