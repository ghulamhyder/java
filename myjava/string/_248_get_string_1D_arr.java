import java.util.Scanner;
import java.util.Arrays;
class _248_get_string_1D_arr{

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);

		String names[]=new String[3];

		

		for(int i=0; i<names.length; i++){

			System.out.print("Enter String array values "+(i+1)+":");
			names[i]=input.nextLine();
		}
		

		for(int j=0; j<names.length; j++){

			System.out.println("name["+j+"]="+names[j]);
			
		}
		//System.out.println(Arrays.toString(names));

		//String name=input.nextLine();
		//System.out.println("you name is:"+name);

	}
}