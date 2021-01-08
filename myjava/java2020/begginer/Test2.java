
class Test2 {

	public static void main(String args[]){


		Test obj=new Test(10,20);
		System.out.println(obj.func());

	}
}

class Test {


	int x,y;

	Test(int a,int b){
		x=a;
		y=b;
	}
	public int func(){
		return this.x + this.y;
	}

}