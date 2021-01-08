import java.util.Arrays;
class _01_reverseWord{


	public static void main(String[] args) {
		
		//the sky is blue
		//blue is sky the
		reverWord("the sky is blue");

		
	}

	public static void reverWord(String str){

			String arr[]=str.split(" ");
			String reveArr[]=new String[arr.length];

			int j=0;
			for(int i=arr.length-1; i>=0; i=i-1){

				reveArr[j]=arr[i];
				j++;
			}

			System.out.println(Arrays.toString(reveArr));


		}
}