
class _128_morethan_one_interface_implements{

	public static void main(String args[]){

		Son obj=new Son();
		obj.disp();
		obj.add();
		
}
}

interface Father {

	public static final int mark=101;
	 int roll=102;
	 public abstract void disp();
	
}

interface Mother{

	public static final int mark1=200;
	public static final int roll1=404;
	public abstract void add();
}

class Son implements Father,Mother{

	public int sum=Father.mark + Mother.mark1;

	public void disp(){

		System.out.println("Roll="+Father.roll);
	}

	public void add(){

		System.out.println("Roll="+Mother.roll1);
		System.out.println("Total Marks="+this.sum);
	}
}



