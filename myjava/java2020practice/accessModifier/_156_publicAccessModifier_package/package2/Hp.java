package package2;
import package1.Laptop;

public class Hp extends Laptop{

	public int d=30;
	public void disph(){
		this.displ();
		System.out.println("Hp class from package2 D = "+(this.d+this.a) );
	}
}