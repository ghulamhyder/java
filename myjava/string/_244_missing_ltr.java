import java.util.*;
class _243_string_oneD_arr{

	public static void main (String args[]){

		char arr[]=new char[3];

		arr[0]='a';
		arr[1]='b';
		arr[2]='d';

		int arr2[]=new int[arr.length];
		int ltr=0;

		for(int i=0; i<arr.length; i++){

			int asci=(int)arr[i];

			arr2[i]=asci;
			
		}

		for(int i=0; i<arr.length; i++){

			if((arr2[(i+1)] - arr2[i]) > 1 ){

				ltr=(arr2[i]+1);
				char mychar=(char)ltr;
				System.out.println(mychar);
				break;
				
			}
			
		}

		
		//System.out.printf("%d : %c ",77,77);
		/*char ch='A'; //65

		int ascii=(int)ch;
		System.out.println("result is:"+ascii);*/

		/*char ch=(char)65;
		System.out.println(ch);*/

	}
}