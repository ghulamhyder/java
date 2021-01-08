class _7_constructor_overloading{


	public static void main(String args[]){

		Myclass obj=new Myclass(10);
		Myclass obj1=new Myclass(30,4.555,4);

		//obj.func(10);
		//obj.func(20,"hyder");
		//obj.func(30,4.55,3.05f);

	}
}

class Myclass {


	 Myclass(int a){

		System.out.println(" constructor1 is "+a);
		
	}
	Myclass(int a,String b){

		System.out.println("constructor 2 is "+a);
		System.out.println("constructor 2 is "+b);
	}

	Myclass(int a,double b,float c){

		System.out.println("constructor 3 is "+a);
		System.out.println("constructor 3 is "+b);
		System.out.println("constructor 3 is "+c);
	}

}


