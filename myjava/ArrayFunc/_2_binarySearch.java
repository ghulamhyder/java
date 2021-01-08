import java.util.Arrays;

class _2_binarySearch{

	public static void main (String args[]){

		int arr[]={54,2,6,99,390,290,3,1,0,-59,392,60};

		int toFindNum=1;
		for(int i=0; i<arr.length; i++){

			int value=arr[i];
			if(toFindNum==value){
				System.out.println("we found it posistion at :"+i);
				break;
			}

		}


		Arrays.sort(arr);

		System.out.println( Arrays.toString(arr) );
		int posistion=Arrays.binarySearch(arr,toFindNum);

		System.out.println("we found through binary search: "+posistion);

		
	}
}