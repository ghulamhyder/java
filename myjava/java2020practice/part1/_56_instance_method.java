class _45_Escape_sequence{


	public static void main(String args[]){

		Test obj=new Test();
		System.out.println(obj.func());
		
	}
}

class Test {

	public static String name="hyder";
	public String str="hello world";
	public String func(){

		return this.str+","+Test.foo();
	}

	public static String foo(){

		return Test.name;
	}
}