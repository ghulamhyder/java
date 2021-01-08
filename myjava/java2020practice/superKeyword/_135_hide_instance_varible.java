
class _135_hide_instance_varible{

	public static void main(String args[]){

		Son obj=new Son();
		obj.disp();
		
	}

}

class Father {

	public int a=100;
}

class Son extends Father {

	public int a=200;

	public void disp(){

		System.out.println("value a="+this.a);
		System.out.println("value a="+this.a);
	}
}