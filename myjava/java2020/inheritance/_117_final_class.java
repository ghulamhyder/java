class _113_final_static{


	public static void main(String args[]){

		Test2 obj=new Test2();

		obj.func(10);
		
		


	}


}

final class Test {

	//static final int roll=101;

	final public void func(int a){

		 
		System.out.println("My value is ="+a);
	}

}
class Test2 extends Test{

	//static final int roll=101;

	 public void func(int a){

		 
		System.out.println("value is ="+a);
	}

}