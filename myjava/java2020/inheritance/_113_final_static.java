class _113_final_static{


	public static void main(String args[]){

		Test obj=new Test();
		
		System.out.println("final values is: "+Test.roll);


	}


}

class Test {

	//static final int roll=101;

	static final int roll;

	static{

		roll=102;
	} 


	public int func(final int a){

		a=102;

		System.out.println("values is "+a);
	}


	
}