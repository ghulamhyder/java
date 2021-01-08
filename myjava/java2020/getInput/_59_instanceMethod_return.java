class _59_instanceMethod_return {

	public static void main(String args[]){


		Myclass obj=new Myclass();
		
		System.out.println("disp method:"+obj.disp(20));
		System.out.println("add method:"+obj.add());

	}


}

class Myclass {


	public int add(){

		int x=20;
		int y=20;
		int z= x + y;
		return z;
	}

	public int disp(int a){


		int x=10;
		int y=a;
		int c=x + y;
		return c;

	}
}