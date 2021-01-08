class _05_lambda{


	public static void main(String[] args) {

		Myinterface<Integer> obj=(Integer a)->{

			System.out.println("value is:"+a);

		};
		
		obj.show(20);	
	}
}


interface Myinterface<T> {

	abstract void show(T a);
}