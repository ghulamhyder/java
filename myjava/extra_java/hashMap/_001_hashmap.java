import java.util.HashMap;
import java.util.Map;

class _001_hashmap{


	public static void main(String[] args) {
		
		HashMap<String,Integer> num=new HashMap<>();

		num.put("one",1);
		num.put("two",2);
		num.put("five",5);

		num.remove("one");
		
		System.out.println(num);


	}
}