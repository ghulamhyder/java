class _113_final_static{


	public static void main(String args[]){

		Test obj=new Test();

		obj.func();
		
		//System.out.println("final values is: "+Test.roll);


	}


}

class Test {

	//static final int roll=101;

	public void func(){

		 final int a=10;
		 a=20;

		System.out.println("value is ="+a);
	}

	


	
}