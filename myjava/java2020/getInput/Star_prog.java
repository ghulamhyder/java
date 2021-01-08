import java.util.Scanner;

class Star_prog {

	public static void main(String args[]){


		Scanner getInput=new Scanner(System.in);
		System.out.print("Enter a number for make star pattern:");
		int a=getInput.nextInt();
		Star obj=new Star(a);
		
		
		obj.func(a);
	}

}


class Star{

	int x;

	 Star(int a){
		x=a;
	}
	public void func(int a){


		for(int i=0; i<this.x; i++){

			for(int j=0; j<=i; j++){

				System.out.print('*');

			}
			System.out.println();

		}
		
		
	}
}