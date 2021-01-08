class Test3{

public static void main(String args[]){


	Myclass obj=new Myclass(5,6);

	System.out.println(obj.func());
}

}

class Myclass {


	int x,y;

	 Myclass(int a,int b){

		x=a;
		y=b;
	}

	public int func(){
		return this.x +this.y;
	}
}