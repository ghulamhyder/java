import java.util.ArrayList;


public class _02_Geneneric_Pair{

	public static void main(String[] args) {
		

	Pair<String,Integer> p1=new Pair<>("hyder",32);
	Pair<Boolean,String> p2=new Pair<>(true,"ali");
	p1.getDescription();
	p2.getDescription();

	}

}

class Pair<X,Y>{

//ye int object class ko extend nhi karta hai
	X x;
	Y y;

	public Pair(X x,Y y){

		this.x=x;
		this.y=y;
	}

	public void getDescription(){

		System.out.println(this.x + "," +this.y);
	}
}