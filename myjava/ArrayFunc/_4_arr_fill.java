
import java.util.Arrays;


class _4_arr_fill{

	public static void main(String[] args) {

	
		int arr1[]={1,2,3,4};
		Arrays.fill(arr1,5);
		//System.out.println(Arrays.toString(arr1));//[5,5,5,5,5];


		String name[]=new String[5];

		Arrays.fill(name,"");

		System.out.println(Arrays.toString(name));

		
	}
}