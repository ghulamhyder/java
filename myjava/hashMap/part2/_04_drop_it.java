import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

class _04_drop_it{

	//static List<Integer> numArr=new ArrayList<>();
	public static void main(String[] args) {
		int numArr[]={1,2,3};


		

		//int x=numArr.get(1);
		//System.out.println(x);

		Myinterface h=(int num)->{

			System.out.println(num);
			if(num >= 3){
				return false;
			}
			else{
				return true;
			}
		};

		

		 //Iterator<Integer> li=numArr.listIterator();

		 for(int i:numArr){

		 	//int index=numArr.indexOf(i);

		 	if(i <=3){
		 		numArr.remove(i);
		 	}
		 	
		 }
		 
		 System.out.println(numArr);
		//numArr.remove(1);


		//int i=0;
		/*while(li.hasNext()){
			//1,2,3

			//System.out.println(li.next());
			int index=numArr.indexOf(li.next());
			System.out.println("index "+index);

			if(li.next() <= 3){
				numArr.remove(index);

			}
			/*if(h.mynum(li.next()) ){
				
				int index=numArr.indexOf(li.next());
				//System.out.println(i);
				numArr.remove(index);
				
			}*/
			//i++;
			//h.mynum(li.next());
		//}/*

		/*int i=0;
		int len=numArr.size();
		while(i<len){
			//System.out.println(len);

			if(h.mynum(numArr.get(i))){
				int index=numArr.indexOf(li.next())
				numArr.remove(i);
				System.out.println(numArr);
			}
			i++;
		}*/

		//System.out.println(numArr);

	}//endfunc
	




}

interface Myinterface {

	public abstract boolean mynum(int a);
}