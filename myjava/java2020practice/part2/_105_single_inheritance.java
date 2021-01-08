class _105_single_inheritance{


	public static void main(String args[]){

		Son obj=new Son();
		obj.getData(20,30);
		obj.disp();
		
	}
}

class Father {


	int x,y;

	public void getData(int a,int b){

		this.x=a;
		this.y=b;

	}

	public int add(){

		int c=this.x + this.y;
		return c;
	}
}

class Son extends Father{

	public void disp(){


		System.out.println("X = "+this.x);
		System.out.println("Y = "+this.y);
		System.out.println("add = "+this.add());
	
	

	}

}