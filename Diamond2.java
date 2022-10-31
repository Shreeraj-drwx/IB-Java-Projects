public class Diamond2{

	public static void main (String [ ] args){


		// The rows until the middle of diamond
		int lw = IBIO.inputInt("Enter the number of rows in the diamond ");
		int space = (lw - 1) / 2;
		int x = lw;
		int y = 1 ;
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
		IBIO.output("");
		for(int c2 = 1; c2 < lw + 1; c2++)
			IBIO.out("*");

		// The bottom rows

		
		int space2 = (lw - 1) / 2;
		
		y = 1 ;
		x = 1;
		int lw2 = lw;
		lw2 = lw2 - 2;

		for( int c = 1; c <= (lw - 1) / 2 ; c++, x++ , y = y + 2, lw2 = lw2 - 2){
			IBIO.output(" ");




			for(space2 = 1; space2 <= x ; space2++ ){
				IBIO.out(" ");
			}
			
			for(int dots = lw2; dots > 0 ; dots--){
					IBIO.out("*");
			}	
			
						
		}

		IBIO.output(" ");

	}

}