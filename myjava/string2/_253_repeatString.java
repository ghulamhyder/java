import java.util.HashMap;
import java.util.Map;
import java.lang.Math;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Collections;

class _253_repeatString{

	//static HashMap<Integer,String> roman=new HashMap<>(Collections.reverseOrder());
	static Map<Integer,String> roman=new TreeMap<>(Collections.reverseOrder());

	public static void main(String[] args) {
		
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

		//double x=2.0;
		//int a=(int)x;
		
		//System.out.println("abc".repeat(a));
		

		//Map<Integer,String> sortRoman=new TreeMap<Integer,String>(roman);

		//Set sortRoman=roman.entrySet();
		//Iterator itr=sortRoman.iterator();

		//StringBuffer result=new StringBuffer();
		String result="";
		int num=10;		

		for( Map.Entry<Integer,String> entry:roman.entrySet() ){

			int val=entry.getKey();
			String key=entry.getValue();

			if(num >=val){

				double a=Math.floor(num/val);
				int x=(int)a;

				//result.append(key.repeat(x));
				result +=key.repeat(x);
				num=num - (val * x );

				
			}
			
			//System.out.println("key:"+key+","+"value:"+val);
			//System.out.println(num);


		}
		System.out.println(result);


		/*while(itr.hasNext()){

			Map.Entry me=(Map.Entry)itr.next();
			System.out.print(me.getKey()+ ":");
			System.out.println(me.getValue());

		}*/






		


		//roman.sort();
		//System.out.println(roman);



		
		/*int num=36;
		StringBuffer result=new StringBuffer();
		//double x=60984.9;
		//System.out.println(Math.floor(6/2));
		roman.forEach((v,k)->{

			if(num >= v){

				System.out.println(v);
				double a=Math.floor(num/v);
				int x=(int)a;

				result.append(k.repeat(x));
				
				//num=num - (v * x );
				//num=20;
				System.out.println(result);
			}

		});*/

		


	}//func

	//System.out.format("k: %s, value:%d%s", k,v);
}