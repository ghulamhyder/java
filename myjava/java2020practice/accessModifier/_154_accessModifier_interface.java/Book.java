class Book {



	public static void main(String args[]){

		Dell del1=new Dell();
		del1.showPrice();

	}
}

class Laptop {

	private int a=10;
	public int show(){

		//System.out.println("A="+this.a);
		return this.a;
	}
}//endclass

class Dell extends Laptop{

	public int b=20;
	public int total=this.show() + this.b;

	public void showPrice(){

		//this.show();
		System.out.println("show="+this.show());
		System.out.println("B="+this.b);
		System.out.println("Total="+this.total);
	}

}//endclass