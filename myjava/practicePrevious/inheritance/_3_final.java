class _3_final{

	public static void main(String[] args) {
		
		
		Myclass obj=new Myclass();
		//int x=Myclass.x + 30;
		System.out.println( obj.func(20) );
	}

}

class Myclass {

	public static final int x=10;

	public int func(int a){

			
		 int c=Myclass.x +a;
	 	return c;
	}


}