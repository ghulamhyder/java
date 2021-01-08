class _6_method_overloading{


	public static void main(String args[]){

		Myclass obj=new Myclass();
		obj.func(10);
		obj.func(20,"hyder");
		obj.func(30,4.55,3.05f);

	}
}

class Myclass {


	public void func(int a){

		System.out.println("func Values is "+a);
	}
	public void func(int a,String b){

		System.out.println("func Values is "+a);
		System.out.println("func String is "+b);
	}

	public void func(int a,double b,float c){

		System.out.println("func Values is "+a);
		System.out.println("func dobule is "+b);
		System.out.println("func float is "+c);
	}

}