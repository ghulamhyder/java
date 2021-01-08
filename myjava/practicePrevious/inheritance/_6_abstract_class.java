public class _6_abstract_class{


	public static void main(String[] args) {
		
		Son obj=new Son();

		System.out.println( obj.func(4) );
		obj.foo();
		obj.test();
	}
}

abstract class Father {

	public static int x=10;


	public abstract  int func(int a); //in java we can not make abstract method in static


}

class Son extends Father {

	public static int y=12;
	 public int func(int b){

		int c=this.x + b;

		return c;
	}

	public static void foo(){

		System.out.println(Son.test());


	}

	public static int test(){

		return Son.y;
	}


}

