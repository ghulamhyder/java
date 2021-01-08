
class Myclass {

	public static void main(String args[]){

		Test obj=new Test();
		obj.a=10;
		obj.b=20;
		obj.add();
		System.out.println("add="+obj.total);
	}
}

class Test{

	int a,b,total;
	public void add(){
		total=a + b;
	}
}

