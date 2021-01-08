
class _140_super_withPerameter_constructor{

	public static void main(String args[]){

		Son obj=new Son(10,5);
		//obj.disp();
		
	}

}

class Father {								//->Super class

	public int x=100;


	Father(int a){								//->default Constructor

			int sum1=this.x + a;
		System.out.println("sum1 of super class ="+sum1);
	}
}

class Son extends Father {					//->Subclass

	public int y=200;

	Son(int b,int c){									//->default Constructor

			super(c);
			int sum2=this.y + b;
		System.out.println("sum2 of subclass ="+sum2);
	}
}