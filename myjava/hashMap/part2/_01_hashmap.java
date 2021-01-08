import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collections;
class _01_hashmap{

	//static HashMap<Integer,String> roman=new HashMap<>();
	static TreeMap<Integer,String> roman=new TreeMap<>(Collections.reverseOrder());
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

				roman.put(1000,"M");
				roman.put(900,"CM");
				roman.put(500,"D");
				roman.put(400,"CD");
				roman.put(100,"C");
				roman.put(90,"XC");
				roman.put(50,"L");
				roman.put(40,"XL");
				roman.put(10,"X");
				roman.put(9,"IX");
				roman.put(5,"V");
				roman.put(4,"IV");
				roman.put(1,"I");


			
		
		System.out.println("Enter number to Know roman number");

		int num=input.nextInt();
		String result="";

		for(Map.Entry<Integer,String> entry:roman.entrySet()){

			int val=entry.getKey();
			String key=entry.getValue();
			
			if(num >=val){

				double a=(num / val);
				int x=(int)a;
				result +=key.repeat(x);
				num=num - (val * x);
			}

		}
		
		
		System.out.println("Roman number is: "+result);
		

	}
}