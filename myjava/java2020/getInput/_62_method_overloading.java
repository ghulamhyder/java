class _62_method_overloading{


	public static void main(String args[]){

		Addition obj=new Addition();

		obj.disp(20,30);
		obj.disp(5,30.0f);


	}
}

class Addition{


	public void disp(int a,int b){

		int x=a;
		int y=b;
		int z=a + b;
		System.out.println("Addition is:"+z);

	}
	public void disp(int a,float b){

		int 	x=a;
		float 	y=b;
		float 	z=a * b;
		System.out.println("Multiplication is:"+z);

	}
}