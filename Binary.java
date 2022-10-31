public class Binary {
	
	public static void main (String [ ] args){

		int[] myNum = {10,20,30,40,50,};
		int length = myNum.length;
		int userNum = 0;
		boolean goodnum = false;

		while(goodnum == false){
			userNum = IBIO.inputInt("Enter a number within the range of the array " + myNum[0] + "-" + myNum[length - 1]+ ":  ");
			if(userNum > myNum[length - 1 ] || userNum < myNum[0]){
				continue;
			}

			else{
				goodnum = true;
			}
		}

		
			

		int c = length / 2;
		boolean present = false;
		while(c < length || c > 0){
			if(myNum[c] < userNum){
				c = c + 1;

			}
			else if(myNum[c] == userNum){
				
				present = true;
				break;
			}
			else{
				c = c - 1;
				if(myNum[c] < userNum && myNum[c] > userNum){
						break;
					}
				}
		}

		if (present == true){
			IBIO.output("Number found!");
		}
		else{	
			IBIO.output("Number not found");
		}
		

		

		
	}
}