class _246_string_2D_arr{


	public static void main(String[] args) {
		
		String name[][]=new String[3][3];

		name[0][0]="hyder0";
		name[0][1]="ali0";
		name[0][2]="khan0";

		name[1][0]="hyder1";
		name[1][1]="ali1";
		name[1][2]="khan1";

		name[2][0]="hyder2";
		name[2][1]="ali2";
		name[2][2]="khan2";

		/*

		[
			["hder0","ali0","khan0"],
			["hder1","ali1","khan1],
			["hder2","ali2","khan2"],


		]

		*/



		//useing enhanched forloop
		/*for(String val[]:name){

			for(String val1:val){

				System.out.print(val1.length()+",");
			}
			System.out.println();
		}*/

		//useing for loop

		for(int i=0; i<name.length; i++){
			

			for(int j=0; j<name[i].length;j++){

				
				System.out.print(name[i][j] + ",");
			}
			System.out.println();
		}


	}//end
}