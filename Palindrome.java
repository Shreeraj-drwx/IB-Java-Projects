public class Palindrome
{
	public static void main(String [ ] args)
	{
		String word = IBIO.inputString("enter your word: ");
		int size = word.length();
		size = size - 1;
		int type = 0;

		if (size % 2 == 0) {
			 type = 1;		
		} 

		else {
			 type = 2;
		}

		//type 1 means even and type 2 mean odd

		if (type == 2) {

			for ( int currentln = 0; currentln <= size; size-- , currentln++ ) { 
				char currentls = word.charAt(currentln);
				char currentle = word.charAt(size);

				if (currentls == currentle) {
					continue;
				}
				else if (currentls != currentle) {
					IBIO.output("not a palindrome");
					System.exit(0);
				}	
			}
			
		}

		else if (type == 1) {
			for ( int currentln = 0; currentln <= size; size--, currentln++ ) {
				char currentls = word.charAt(currentln);
				char currentle = word.charAt(size);

				if (currentls == currentle) {
					continue;
				}
				else if (currentls != currentle) {
					IBIO.output("not a palindrome");
					System.exit(0);
				}	
			}
		}
		IBIO.output("This is a palindrome");
	}
}