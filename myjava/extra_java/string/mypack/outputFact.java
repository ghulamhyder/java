import fact.Myfact;

class outputFact {


	public static void main(String[] args) {
		
		
		Myfact obj=new Myfact();
		//obj.myfact1(5);
		//int num=obj.myfact(5);
		System.out.print( obj.myfact1(5) );



	}

	/*public static int myfact(int num){

		int fact=0;
		if(num==1){

			return 1;
		}
		else {

			fact=num * myfact((num-1));

		}
		return fact;

	}*///end
}