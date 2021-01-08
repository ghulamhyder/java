
class _139_super_with_constructor{

	public static void main(String args[]){

		Son obj=new Son();
		//obj.disp();
		
	}

}

class Father {								//->Super class

	public int a=100;						

	Father(){								//->default Constructor

		System.out.println("value a="+this.a);
	}
}

class Son extends Father {					//->Subclass

	public int b=200;

	Son(){									//->default Constructor

			super();
		System.out.println("value b="+this.b);
	}
}