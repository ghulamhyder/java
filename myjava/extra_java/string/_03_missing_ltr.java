import java.util.Arrays;


class _03_missing_ltr{

	public static void main(String[] args) {
		

		Myclass obj=new Myclass();
		char arr1=obj.miss_ltr("abd");
		System.out.println(arr1);
	}

}

class Myclass {


	public char miss_ltr(String str){

		//int arr[]=new int[str.length()];
		char hyde='n';

		for(int i=0; i<str.length(); i++){

			int x=str.charAt(i);
			int y=str.charAt((i+1));

			if((y-x) > 1){

				//System.out.println(x);
				hyde=(char)(x+1);
				break;

			}

		}

		return hyde;

	}
}

