class _113_final_static{


	public static void main(String args[]){

		Test obj=new Test();

		obj.func(10);
		
		//System.out.println("final values is: "+Test.roll);


	}


}

class Test {

	//static final int roll=101;

	public void func(final int a){

		 
		System.out.println("value is ="+a);
	}

	


	
}