
class _136_show_instance_varible{

	public static void main(String args[]){

		Son obj=new Son();
		obj.disp();
		
	}

}

class Father {

	//public int a=100;
	public int a;
}

class Son extends Father {

	//public int a=200;
	public int a;

	public void disp(){

		this.a=100;
		super.a=300;
		System.out.println("value a="+this.a);
		System.out.println("value a="+super.a);
	}
}