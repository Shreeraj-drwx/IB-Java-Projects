import java.lang.Math;

public class SuvatCalc{
	public static void main(String [ ] args){

		double s = 0;
		double u = 0;
		double v = 0;
		double a = 0;
		double t = 0;
		double sum1 = 0;
		double sum2 = 0;
		boolean display = true;
		boolean stayin = true;
		int whatfind = -1;
		IBIO.output("What values do you know (NOTE enter '123.321' if you dont know the value)	: ");
		
			s = IBIO.inputDouble("Enter the displacement: ");
			u = IBIO.inputDouble("Enter the inital velocity: ");
			t = IBIO.inputDouble("Enter the time taken: ");
			a = IBIO.inputDouble("Enter the acceleration: " );
			v = IBIO.inputDouble("Enter the final velocity: ");

		if(v == 123.321 && a != 123.321 && u != 123.321 && t != 123.321){
			v = u + ( a * t);
		}
		if(s == 123.321 && v != 123.321 && u != 123.321 && t != 123.321){
			s = 0.5*(u + v) * t;
		}
		
		IBIO.output("[1] : displacement");
		IBIO.output("[2] : inital velocity");
		IBIO.output("[3] : time taken");
		IBIO.output("[4] : acceleration");
		IBIO.output("[5] : final velocity");
		IBIO.output("[6] : end");	

		while(stayin == true){
			while(whatfind > 6 || whatfind < 0) {
				whatfind = IBIO.inputInt("What value you want to find : ");
			}
			
			if(whatfind == 1){
				if(v != 123.321 && u != 123.321 && t != 123.321  ){
					s = ((v+u)/2)*t;
				}
				else if(u != 123.321 && a != 123.321 && t != 123.321 ){
					s = (u*t) + 0.5 * (a  * (t*t));
				}
				else{
					IBIO.output("Not enough info given");
					display = false;
				}
				
				if(display == true){
					IBIO.output("The displacement is : " + s );
					display = false;
				}

			}
			else if(whatfind == 2){
				if(v != 123.321 && a != 123.321 && t != 123.321 ){
					u = v - (a * t);
				}

				else if(v != 123.321 && a != 123.321 && s != 123.321){
					sum1 = (v * v) - (2*(a * s));
					u = Math.sqrt(sum1);
				}
				else{
					IBIO.output("Not enough info given");
					display = false;
				}
				if(display == true){
					IBIO.output("The inital velocity is : " + u );
					display = false;
				}	
			}

			else if(whatfind == 3){
				if(v != 123.321 && a != 123.321 && u != 123.321 ){
					t = (v - u)/ a;
				}
				else if(v != 123.321 && s != 123.321 && u != 123.321)
			 		t = (2 * s/u + v);
			 	else {
					IBIO.output("Not enough info given");
					display = false;
				}	
				if(display == true){
					IBIO.output("The time taken is : " + t );
					display = false;
				}
			}
				
			else if(whatfind == 4){
			 	if(v != 123.321 && t != 123.321 && u != 123.321){
			 		a = (v - u)/t;
			 	}
			 	else if(v != 123.321 && s != 123.321 && u != 123.321){
			 		a = ((v * v) - (u * u)) / 2 * s;
			 	}
			 	else{
					IBIO.output("Not enough info given");
					display = false;
				}	
				if(display == true) {
					IBIO.output("The acceleration is : " + a );
					display = false;
				}	
			}

			else if(whatfind == 5) {
				if(u != 123.321 && a != 123.321 && t != 123.321){
					v = u + (a * t);
				}
				else if(u != 123.321 && a != 123.321 && t != 123.321){
					sum2 = (u * u) + (2*(a * s));
					v = Math.sqrt(sum2);
				}
			 	else{
					IBIO.output("Not enough info given");
					display = false;
				}	
				if(display == true) {
					IBIO.output("The final velocity is : " + a );
					display = false;
				}
			}

			else if(whatfind == 6){
				stayin = false;

			}
		}
	}			
}
