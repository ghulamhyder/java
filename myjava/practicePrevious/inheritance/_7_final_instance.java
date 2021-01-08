public class _7_final_instance{


	public static void main(String[] args) {
		Myclass obj=new Myclass(10);

		System.out.println(obj.func());
		System.out.println(obj.foo(30));
	}
}

class Myclass {

	public final int x;

	Myclass(int num){

		this.x=num;
	}

	public int func(){

		this.x=20;
		return this.x;
	}

	public int foo(final int a){

		a=a+1;

		return a;

		//System.out.println("values is "+a);
	}

}