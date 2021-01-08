
class _127_class_implements_interface{

	public static void main(String args[]){

		Son obj=new Son();
		obj.disp();
		
		}
}

interface Fatehr {

	public static final int mark=101;
	public int roll=121;
	public abstract void disp();
	
	
}

class Son implements Fatehr{


	public int mark1=200;
	public int sum=Fatehr.mark + this.mark1;

	public void disp(){

			//Fatehr.roll=104;
		System.out.println("Rolll="+Fatehr.roll);
		System.out.println("Sum="+this.sum);
	}
}