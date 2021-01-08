package package1;


public class Dell extends Laptop{

	public int b=30;
	public void dispd(){

		Mobile obj=new Mobile();

		this.displ();
		System.out.println("Mobile instance varible e="+obj.e);
		System.out.println("Dell class from package1 B = "+(this.b + this.a));
	}
}