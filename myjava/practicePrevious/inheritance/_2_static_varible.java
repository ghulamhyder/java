class _2_static_varible{

	public static void main(String[] args) {
		
		//Myclass obj=new Myclass();

		int x=Myclass.x + 30;
		System.out.println(x);
	}

}

class Myclass {

	public static int x=10;

	public int func(int a){

		 int c=Myclass.x +a;
	 	return c;
	}


}