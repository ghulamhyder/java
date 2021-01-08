class _61_nesting_instance_method{


	public static void main(String args[]){

		Mycalss obj=new Mycalss();

		obj.disp();
		//System.out.println( obj.disp() );

		//System.out.println(obj.lname("rind"));

	}
}


class Mycalss {

	public int add(){

		int a=10;
		int b=20;
		int c=a + b;
		return c;
	}
	public void disp(){
		
		int x=this.add();
		System.out.println("Addition = "+x);
	}
}