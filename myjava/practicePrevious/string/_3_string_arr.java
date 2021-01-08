import java.util.Arrays;
class _3_string_arr{

	public static void main(String[] args) {
		
		String arr[]=new String[3];
		arr[0]="hyder";
		arr[1]="ali";
		arr[2]="Rind";
		System.out.println(Arrays.toString(arr));

		int arr1[]=new int[3];

		arr1[0]=11;
		arr1[1]=22;
		arr1[2]=33;
		int a=1;
		//System.out.println( (arr1[a+1] - arr1[0]) );
		if(arr1[a+1] - arr1[0] > 1){
			System.out.println(arr1[0]);
		}
	}
}