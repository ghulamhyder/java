class _1_single_inheritance{


	public static void main(String args[]){

		Myclass2 obj=new Myclass2(4,5);

		//obj.multi();
		System.out.println(obj.multi());
		//System.out.println(obj.multi());
	}
}

class Myclass1{

	public int x;

	Myclass1(int a){

		this.x=a;
	}

	public int add(){

		int b=this.x +10;
		return b;
	}
}

class Myclass2 extends Myclass1{

	public int y;

	Myclass2(int b,int a){

			super(a);
		this.y=b;
	}

	public int multi(){

		System.out.println(this.add());
		int c=this.y * this.x;
		return c;
	}

}




