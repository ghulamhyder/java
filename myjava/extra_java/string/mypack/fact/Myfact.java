package fact;

public class Myfact{


	public  int myfact1(int num){

		//System.out.println("hello");

		int fact=0;
		if(num==1){

			return 1;
		}
		else {

			fact=num * myfact1(num-1);

		}
		//System.out.println(fact);
		return fact;

	}//end
	
}