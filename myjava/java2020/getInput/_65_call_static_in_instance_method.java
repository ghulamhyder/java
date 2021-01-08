class _64_call_static_method{


	public static void main(String args[]){

		
		Myclass obj=new Myclass();
		obj.func();

		//Myclass.disp();

	}

	
}

class Myclass {

	
	public void func(){

		int x=Myclass1.disp();
		System.out.println(x);

	}

}

class Myclass1{


	public static int disp(){

		int x=10;
		int y=20;
		int c=x + y;
		return c;
		//System.out.println("value of A = " + x);

	}

}

