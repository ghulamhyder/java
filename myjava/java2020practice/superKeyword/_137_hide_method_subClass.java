
class _137_hide_method_subClass{

	public static void main(String args[]){

		Son obj=new Son();
		obj.disp();

		
	}

}

class Father {

	public int a=100;

	public void func(){

		System.out.println("hello world"+this.a);
	}
}

class Son extends Father {

	public int b=500;

	public void func(){

		System.out.println("hello world "+this.b);
	}

	public void disp(){

		this.func();
		
	}
}

