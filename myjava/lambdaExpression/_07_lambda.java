class _07_lambda{

	public static void main(String[] args) {

		//Myclass obj=new Myclass(); //polymorphic statement
		//obj.book();

		Myinterface h=new Myinterface(){

			public void book(){
				System.out.println("hellojani");
			}

		};

		h.book();
		
	}
}

interface Myinterface {

	public abstract void book();
}

/*class Myclass implements Myinterface{

	public void book( ){

		System.out.println("hello");
	}
}*/