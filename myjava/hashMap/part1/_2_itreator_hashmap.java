import java.util.HashMap;
import java.util.Iterator;


class _2_itreator_hashmap{


	static HashMap<String,Integer> contact=new HashMap<String,Integer>();

	public static void main(String[] args) {

		contact.put("hyer",342);
		contact.put("ali",333);
		contact.put("khan",345);
		
		Iterator<String> str=contact.keySet().iterator();

		while(str.hasNext()){


				System.out.println(str.next());
		}
		
	}

	
}