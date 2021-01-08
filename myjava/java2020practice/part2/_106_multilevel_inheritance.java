class _105_single_inheritance{


	public static void main(String args[]){

		GrandSon obj=new GrandSon();
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

	public int num=4;
	public int multi(){


		int mul=this.add() * this.num;
		return mul;
	
	

	}

}

class GrandSon extends Son {


	public String name="ayaz";
	public int age=33;
	public void disp(){

		System.out.println("X = "+this.x);
		System.out.println("Y = "+this.y);
		System.out.println("add = "+this.add());
		System.out.println("name = "+this.name);
		System.out.println("age = "+this.age);
		System.out.println("multi = "+this.multi());
	
	}

}





