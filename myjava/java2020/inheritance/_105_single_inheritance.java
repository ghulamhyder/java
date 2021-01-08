class _105_single_inheritance{


	public static void main(String args[]){
		Child obj=new Child();

		obj.getData(10,20);
		obj.disp();


	}
}

class Father {

	public int a,b;

	public void getData(int p,int q){
		this.a=p;
		this.b=q;

	}


}

class Child extends Father{

	public int add(){

		int add=this.a + this.b;
		return add;
	}

	public void disp(){


		System.out.println("A = "+this.a);
		System.out.println("B = "+this.b);
		System.out.println("Sum = "+this.add());
	}

}

