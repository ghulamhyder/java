public class _8_static_final{


	public static void main(String[] args) {
		Myclass obj=new Myclass();

		System.out.println(obj.func());
		obj.foo(44);
		obj.myfunc();
	}
}

final class Myclass {  //age hum is final banadegey to ye extends nhi hoskta ha

	public static final int x;

	static{

		x=102;
	}

	public int func(){

		//this.x=20;
		return this.x;
	}
	public int foo(final int a){

		//a=a+1;

		return a;

		//System.out.println("values is "+a);
	}
	public void myfunc(){

		final int a=10;

		//a=20;
		System.out.println(a);

	}

}