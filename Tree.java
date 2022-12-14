public class Tree{

	public static void main (String [ ] args){


		
		int lw = IBIO.inputInt("Enter how tall you want the tree");
		String type = null;
		int space = (lw - 1) / 2;
		int x = lw;
		int y = 1 ;

		if(lw % 2 == 0){
			type = "even";
		}
		else{
			type = "odd";
		}
		for(int c = 1; c <= (lw - 1) / 2 ; c++, x = x - 2 , y = y + 2){
			IBIO.output(" ");

			for(space = x; space - 1 > 0; space = space - 2 ){
				IBIO.out(" ");
			}
			for(int dots = 1; dots <= y ; dots++){
					IBIO.out("*");
			}					
		}
		// The middle row


		if(type == "odd"){
			IBIO.output("");
			for(int c2 = 1; c2 < lw+1; c2++){
				IBIO.out("*");
				
			}
		}
		else{
			IBIO.output("");
			IBIO.out(" ");
			for(int c2 = 1; c2 < lw; c2++){
				IBIO.out("*");
			}
		}
		if(type == "odd"){
			for(int c4 = 1; c4 < (lw+1)/2; c4++ ){
				IBIO.output(" ");
				for(int c3 = 1; c3 < (lw+1)/2; c3++){
					IBIO.out(" ");	
				}
				IBIO.out("*");

			}
		}
		else{
			for(int c4 = 1; c4 < (lw)/2; c4++ ){
				IBIO.output(" ");
				for(int c3 = 1; c3 < (lw+2)/2; c3++){
					IBIO.out(" ");	
				}
				IBIO.out("*");

			}
		}
		IBIO.output("");
		IBIO.output("Merry Christmas!");
	}
}