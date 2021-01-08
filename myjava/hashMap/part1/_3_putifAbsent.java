import java.util.HashMap;
import java.util.Map;



class _3_putifAbsent{

	
	public static void main(String[] args) {
		
		Map<String,Integer> mymap=new HashMap<>();
	 //HashMap<String,Integer> mymap=new HashMap<String,Integer>();
		mymap.put("one",1);
		mymap.put("two",2);
		mymap.put("five",5);

		//mymap.put("one",10);change value



		//*(keySet()*

		//it show all the keys set in list arr shows

	///*putIfAbsent()*///
		mymap.putIfAbsent("three",3);//if key is alredy then this not add value;

	//*get()*///
		//-> is get value of specific key give in the function if key is not present in map then
		//give null value
		//System.out.println( mymap.get("six") );

	///*containsKey()*///

		//System.out.println( mymap.containsKey("one") );

	///*containsValue()*///

		//System.out.println( mymap.containsValue(6) );

	///*replace()*///

		//mymap.replace("one",7,9); //if value is present then change otherwise it not change
		//System.out.println( mymap );

	//*remove()*////
	mymap.remove("two",4); //if same value is not then not remove
	System.out.println( mymap );	




	}

}