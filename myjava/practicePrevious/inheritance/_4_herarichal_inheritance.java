class _4_herarichal_inheritance{

	public static void main(String[] args) {
			
			Son obj=new Son(4);
			System.out.println(obj.disp());

			Daughter objd=new Daughter();
			System.out.println(objd.func());
	}
}

class Father {

		public int a=10;

		public int add(int b){

			int c=this.a +b;
			return c;
		}

}



class Son extends Father {

	public int x;

	Son(int a){
		this.x=a;
	}

	public int disp(){

		//System.out.println( this.add() );
		int d=this.add(3) + this.x;
		return d;
	}
}

class Daughter extends Father{


	public int x=12;

	public int func(){

		int d=this.a + this.x;

		 System.out.println(d);

		 return this.add(4) + d; 

	}

}






