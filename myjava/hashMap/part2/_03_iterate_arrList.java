import java.util.ArrayList;
import java.util.Iterator;


class _03_iterate_arrList{

	static ArrayList<String> mynum=new ArrayList<>();
	public static void main(String[] args) {

		mynum.add("aa");
		mynum.add("bb");
		mynum.add("cc");

		
		/*for(int i=0; i<mynum.size(); i++){

			
		}*/

		/*for(String str:mynum){
			System.out.println(str+"");
		}*/


		/*Iterator<String> li=mynum.listIterator();

		while(li.hasNext()){

			System.out.println(li.next());
		}*/

		mynum.forEach((v)->{

			System.out.println(v+",");
		});



		
	}
}