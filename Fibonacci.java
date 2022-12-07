public class Fibonacci
{
	public static void main(String [ ] args) {
		
		int n = -1;
		while (n < 0) {
			n = IBIO.inputInt("enter a positive number ");
		}	

		int a = 1;
		int b = 2;
		int c = a + b;
		boolean present = false;

		while (present == false ){
			if ( n == a || n == b || n == c || n == 0 ) {
				System.out.println("Yes part of the fibonacci sequence");
				present = true;
			} else if (n > c) {
					a = c + b;
					b = c + a;
					c = a + b;
					System.out.println(a+","+ b +","+ c);
					continue;
			} else {
					System.out.println("not part of sequence");
					present = true;
			}	

		}
	
	}

}
