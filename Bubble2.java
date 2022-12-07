public class Bubble2{

	public static void main (String [ ] args){

		int length = IBIO.inputInt("Enter the length of the array to sort: ");
		int[] myNum = new int[length];
		int c = 0;
		int save = 0;

		// To enter values into an array to then be sorted
		for (int c4 = 0; c4 < length; c4++){
			myNum[c4] = IBIO.inputInt("Enter the value: ");
		}

		for (int c3 = 0; c3 < length; c3++){
			c = 0;
			while(c < length - 1){

				if (myNum[c] > myNum[c+1]){
					save = myNum[c];
					myNum[c] = myNum[c+1];
					myNum[c+1] = save;
					c++;
				}
				else {
					c++;
				}
			}		
		}

		for (int c2 = 0; c2 < length; c2++){
			IBIO.output(myNum[c2]);
		}
	}
}