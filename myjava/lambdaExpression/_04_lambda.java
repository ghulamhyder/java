
public class _04_lambda{

	//static String staticVarible="CodingFun";
	//String instanceVarible="CodingFun";

	public static void main(String[] args) {
		
		CustomeLocalUsage<String> h=(String t)->{

			System.out.println("hello"+t);
		};

		h.Test("hyder");
	}
	

}

interface CustomeLocalUsage<T>{


	void Test(T a);

}

