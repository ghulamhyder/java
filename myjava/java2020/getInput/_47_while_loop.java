import java.util.Scanner;

class _47_while_loop{


	public static void main(String args[]){

		Scanner obj=new Scanner(System.in);

		int i;

		System.out.println("Enter 0 to exit");
		boolean bool=true;
		 while(bool){

		 	System.out.println("Enter any number: ");
		 	i=obj.nextInt();

		 	if(i==0){
		 		System.out.println("program exit");
		 		break;
		 	}
		 	System.out.println("You Entered Wrong number: "+i);
		 	bool=false;
		 }

	}
}