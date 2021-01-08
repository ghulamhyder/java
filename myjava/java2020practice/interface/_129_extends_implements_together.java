
class _129_extends_implements_together{

	public static void main(String args[]){

		Son obj=new Son();
		obj.disp();
		
	}
}

interface Mother {

	public static final int c=101;

	public abstract void disp();
}

class Father {

	public int a=10;

	public int add(int y){

		int b=y;
		return (this.a + b);
	}

}

class Son extends Father implements Mother { //multiple_inhertance

	public int m=Mother.c;
	public int sum=this.add(20);

	public void disp(){


		System.out.println("Mother C="+this.m);
		System.out.println("Father method add=" + this.sum );


	}


}



	
	

