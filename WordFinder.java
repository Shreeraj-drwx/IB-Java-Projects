public class WordFinder{
	public static void main(String [ ] args){

		String userword = IBIO.inputString("Enter the word you are searching for: ");
		String usersent = IBIO.inputString("Enter your sentence to search for your word: ");

		int indexw = 0;
		int indexs = 0;
		int sow = userword.length();        
		int sos = usersent.length();
		boolean present = false;
		boolean matchInProgress = false;
		boolean complete = false;
		char currentlw;
		char currentls;
		int x = 0;
		

 		while( complete == false && indexs < sos ) {

			currentlw = userword.charAt(indexw);
			currentls = usersent.charAt(indexs);

			if(currentlw == currentls ) {
				matchInProgress = true;
				indexw = indexw + 1;
				if (matchInProgress && indexw == (sow) ) {
					indexw = 0;
					x = x + 1;
					present = true;
					if (indexs >= sos){
						complete = true;
					}
					else if(indexs < sos){
						continue;
					}
						
				}
			} else {
				matchInProgress = false;
				indexw = 0;
			}
			
			indexs = indexs + 1;
		}

		if (present == true) {
			IBIO.output("Word found!");	
			IBIO.output("Your word was found " + x + " times");
		} else {
			IBIO.output("Word not found");	
		}
	}

}