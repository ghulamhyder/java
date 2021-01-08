class _106_hierarchical_inheritance{


	public static void main(String args[]){

		System.out.println("Son values");
		Son objSon=new Son();
		objSon.getData(10,20);
		objSon.disp();

		System.out.println("daughter values");
		Daughter objD=new Daughter();
		objD.getData(5,10);
		objD.disp();

	}





}//endclass

	class Father {

	public int a,b;

	public void getData(int p,int q){
		this.a=p;
		this.b=q;

	}


}//end class

class Son extends Father{

	public int add(){

		int add=this.a + this.b;
		return add;
	}

	public void disp(){


		System.out.println("A = "+this.a);
		System.out.println("B = "+this.b);
		System.out.println("Sum = "+this.add());
	}

}//end class
class Daughter extends Father{

	public int multi(){

		int multi=this.a * this.b;
		return multi;
	}

	public void disp(){


		System.out.println("A = "+this.a);
		System.out.println("B = "+this.b);
		System.out.println("Sum = "+this.multi());
	}

}//end class



