package package2;
import package1.Mobile;


public class Computer{

	public int c=30;
	public void dispc(){

		//Laptop obj6=new Laptop();
		//obj6.displ();
		Mobile obj=new Mobile();
		System.out.println("Mobile instance varible e = "+obj.e);
		System.out.println("Computer class from package2 C = "+this.c);
	}
}