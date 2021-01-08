class _60_method_return_string{


	public static void main(String args[]){

		Mycalss obj=new Mycalss();

		System.out.println(obj.fname());

		System.out.println(obj.lname("rind"));

	}
}


class Mycalss {

	public String fname(){

		String str="hyder";
		return str;
	}
	public String lname(String str){
		
		String str1=str;
		return str1;
	}
}