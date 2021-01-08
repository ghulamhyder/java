class _06_lambda{


	public static void main(String[] args) {

		Myclass<Integer,String> obj=new Myclass<>(20,"hyder");
		System.out.println(obj.getAvalue());
		System.out.println(obj.getBvalue());
		
		
		
	}
}


class Myclass<I,S>{

	I a;
	S b;

	public Myclass(I x,S y){

		this.a=x;
		this.b=y;
	}

	public I getAvalue(){

		return this.a;
	}
	public S getBvalue(){

		return this.b;
	}
}