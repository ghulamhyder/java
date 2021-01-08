class _08_lambda{

	public static void main(String[] args) {
		
		Test<Integer> h=(Integer a)->{

			for(int i=0; i<5; i++){

				a=a+i;

			}
			return a;
		};
		
		System.out.println(h.myfunc(5));
	}//main
}

interface Test<I>{

	abstract public I myfunc(I a);
}