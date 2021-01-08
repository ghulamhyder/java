class _63_method_overloading_NumPerameter{


	public static void main(String args[]){

		Addition obj=new Addition();

		obj.disp(20);
		obj.disp(5,30);


	}
}

class Addition{


	public void disp(int a){

		int x=a;
		//int y=b;
		//int z=a + b;
		System.out.println("value is:"+a);

	}
	public void disp(int a,int b){

		int 	x=a;
		int 	y=b;
		int 	z=a * b;
		System.out.println("Multiplication is:"+z);

	}
}