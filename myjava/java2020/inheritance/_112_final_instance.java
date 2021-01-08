class _112_final_instance{


	public static void main(String args[]){

		Test obj=new Test(102);
		
		System.out.println("final values is: "+obj.roll);


	}


}

class Test {

	final int roll;

	Test(int num){

		this.roll=num;
	}
}