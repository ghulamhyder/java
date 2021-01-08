public class _5_methodOverriding{


	public static void main(String[] args) {
		
		Myclass2 obj=new Myclass2();

		System.out.println( obj.func(10) );


	}
}

 class Myclass1 {

	public static int x;
	public int func(int a){

		Myclass1.x=a;
		
		return Myclass1.x;
	}


}

class Myclass2 extends Myclass1 {


		public int func(int b){

			int a=b + 12;
			return a;

		}

}