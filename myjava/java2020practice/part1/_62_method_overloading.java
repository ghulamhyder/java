class _45_Escape_sequence{


	public static void main(String args[]){


		Test obj=new Test();
		
		
		//obj.func(11);
		System.out.println(obj.func("hyder"));
		System.out.println(obj.func("khan",12));
		System.out.println(obj.func(33));


	}
}

class Test {


	public String func(String name){
		return name;

	}
	public int func(int num){
		return num;
		
	}
	public String func(String name,int num){
		return name + ',' + num;
		
	}
}