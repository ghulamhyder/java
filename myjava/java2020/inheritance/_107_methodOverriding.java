class _107_methodOverriding{


	public static void main(String args[]){


		System.out.println("calss Father");
		Father objF=new Father();
		objF.call();
		
		System.out.println("calss Son");
		Son objS=new Son();
		objS.getData(10,20);
		objS.call();

		System.out.println("calss Daughter");
		Daughter objD=new Daughter();
		objD.getData(5,6);
		objD.call();

	}


}


class  Father {


	public int a,b;

	public void getData(int x,int y){
		this.a=x;
		this.b=y;
	}

	public void call(){

		System.out.println("super class \"Father\"");
	}
}
class Son extends Father{

	public void call(){

		int c=this.a + this.b;
		System.out.println("Sub classs Son "+c);
	}

}

class Daughter extends Father{

	public void call(){

		int c=this.a * this.b;
		System.out.println("Sub classs Daughter "+c);
	}

}





