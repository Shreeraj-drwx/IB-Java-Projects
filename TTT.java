public class TTT{
	
	public static void main(String [ ] args){

		IBIO.output("Welcome to tic-tac-toe, java edition");
			
		int n = IBIO.inputInt("what dimension would you like the board to be? ex: 3x3 or 4x4:") ;
		char [] [] board = new char [n][n];	
		boolean active = true;
		

		while(active == true){
			board = player1(n, board);
			if(isMatch(n, board) == true){
				System.out.println("Player 1 has won thanks for playing!");
				active = false;
				break;
			}
			if(isFull(n, board) == true){
				System.out.println("The board is full so the match will end in a draw!");
				active = false;
				break;
			}
			board = player2(n, board);
			if(isMatch(n, board) == true){
				System.out.println("Player 2 has won thanks for playing!");
				active = false;
				break;
			}
			if(isFull(n, board) == true){
				System.out.println("The board is full so the match will end in a draw!");
				active = false;
				break;
			}
			
		}	
	}
	public static char [][] player1(int n , char [][] board){
		boolean moved = false;
		while(moved == false){
			System.out.println("Player#1");
			int x = IBIO.inputInt("Enter the x coordinate: ");
			int y = IBIO.inputInt("Enter the y coordinate: ");
			if(isEmpty(x , y, board) == true){
				board[x][y] = 'x';
				printArray(n, board);
				return board;
			}
			else{
				System.out.println("You can only add to an X to a sqaure which is empty try a different spot");
				continue;
			}
		}
		return board;

	}
	public static char [][] player2(int n, char [][] board){
		boolean moved = false;
		while(moved == false){
			System.out.println("Player#2");
			int x = IBIO.inputInt("Enter the x coordinate: ");
			int y = IBIO.inputInt("Enter the y coordinate: ");
			if(isEmpty(x , y, board) == true){
				board[x][y] = 'o';
				printArray(n, board);
				return board;
			}
			else{
				System.out.println("You can only add to an 0 to a sqaure which is empty try a different spot");
				continue;
			}
		}
		return board;
	}
	public static Boolean isEmpty(int x, int y, char [][] board){
		if(board[x][y] == '\0'){
			return true;
		}
		else{
			return false;
		}
	}
	public static Boolean isMatch(int n,  char [][] board){
		//rows 
		
		int counter = 0;
		int counteralt = 0;
		char save = 'x';
		char savealt = 'o';
		for(int i = 0; i < n ; i++){
			for(int i2 = 0; i2 < n; i2++){
				if(board[i][i2] == save && save != '\0'){
					counter++;
					continue;
				}
				else if(board[i][i2] == savealt && savealt != '\0'){
					counteralt++;
					continue;
				}
				else{
					continue;
				}
			}
			if(counter == n){
				return true ;
			}
			else if(counteralt == n){
				return true;
			}
			else{
				counter = 0;
				counteralt = 0;
				continue;
			}
		}
		//columns
		int counter2 = 0;
		int counter2alt = 0;
		char save2 = 'x';
		char save2alt = 'o';
		for(int i = 0; i < n ; i++){
			for(int i2 = 0; i2 < n; i2++){
				if(board[i2][i] == save2 && save2 != '\0'){
					counter2++;
					continue;
				}
				else if(board[i2][i] == save2alt && save2alt != '\0'){
					counter2alt++;
					continue;
				}
				else{
					continue;
				}
			}
			if(counter2 == n){
				return true;
			}
			else if(counter2alt == n){
				return true;
			}
			else{
				counter2 = 0;
				counter2alt = 0;
				continue;
			}
		}
		//down diagonals
		int counter3 = 0;
		int counter3alt = 0;
		char save3 = 'x';
		char save3alt = 'o';
		for(int i = 0, i2 = 0; i < n && i2 < n; i++, i2++ ){
			if(board[i][i2] == save3 && save3 != '\0'){
				counter3++;
				continue;
			}
			else if(board[i][i2] == save3alt && save3alt != '\0'){
				counter2alt++;
				continue;
			}
			else{
				continue;
			}
		}
		if(counter3 == n){
				return true;
		}
		else if(counter3alt == n){
			return true;
		}
		//up diagonal
		int counter4 = 0;
		int counter4alt = 0;
		char save4 = 'x';
		char save4alt = 'o';
		for(int i = n-1, i2 = 0; i >= 0 && i2 < n; i--, i2++ ){
			if(board[i][i2] == save4 && save4 != '\0'){
				counter4++;
				continue;
			}
			else if(board[i][i2] == save4alt && save4alt != '\0'){
				counter4alt++;
				continue;
			}
			else{
				continue;
			}
		}
		if(counter4 == n){
			return true;
		}
		else if(counter4alt == n){
			return true;
		}
		return false;
	}
	public static void printArray(int n, char board [][]){
		for (int i = 0; i < n; i++) {
            for (int i2 = 0; i2 < n; i2++) {
                System.out.print(board[i][i2] + " | ");
            }
            System.out.println();
            for (int i3 = 0; i3 < n; i3++){
            	System.out.print("---");
            }
            System.out.println();
             
        }
	}
	public static Boolean isFull(int n, char board [][]){
		for (int i = 0; i < n; i++) {
            for (int i2 = 0; i2 < n; i2++) {
                if (board[i][i2] == '\0') { 
                    return false; 
                }
            }
        }
        return true; 
	}
}