class _45_Escape_sequence{


	public static void main(String args[]){

		Test obj1=new Test();
		obj1.x=20;
		obj1.y=101;
		
		Test obj2=new Test();
		obj2.x=20;
		obj2.y=102;

		Test obj3=new Test();
		obj3.x=30;
		obj3.y=103;

		System.out.println(obj1.x+","+obj1.y);
		System.out.println(obj2.x+","+obj2.y);
		System.out.println(obj3.x+","+obj3.y);
		
	}
}


class Test {


	public static int x=10;
	public int y=100;
}