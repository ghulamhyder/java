import java.util.Scanner;

class SimpleCalcu {
	
	public static void main(String args[]){


		Double a,b;
		char opert;
		Scanner input=new Scanner(System.in);

		System.out.print("choose operator +, -, *, /: ");
		opert=input.next().charAt(0); //string cant converted to chars erro

		System.out.print("Enter value a : ");
		a=input.nextDouble();

		

		System.out.print("Enter value b : ");
		b=input.nextDouble();

		Calcu output=new Calcu(a,b,opert);

		if(output.result()==0.0){
			System.out.println("you have enter invalid value");
			
			
		}


		System.out.println("result is :"+output.result());



	}

}

class Calcu {


	Double x,y;
	char operator;

	 Calcu(Double a,Double b,char opert){ //construct

	 	x=a;
	 	y=b;
	 	operator=opert;

	 }

	 public Double result(){

	 	switch(this.operator){

	 		case '+':
	 		return this.x + this.y;
	 		//break;

	 		case '-':
	 		return this.x - this.y;
	 		//break;

	 		case '*':
	 		return this.x * this.y;
	 		//break;

	 		case '/':
	 		return this.x / this.y;
	 		//break;

	 		default:
	 		return 0.0;
	 	}

	 }
}
