
public class Calculator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char operatorMath = 'a';
		
		//if(operatorMath == '/'){
		//	System.out.println("TRUE");
		//}else{
			//System.out.println("FALSE");
		
		double num1 = 20.0;
		double num2 = 24.5;
		double result;
		
		if(operatorMath == '+'){
			result = num1 + num2;
			System.out.println(result);
			
		}else if(operatorMath == '/'){
			result = num1 / num2;
			System.out.println(result);
		}else if(operatorMath == '*'){
			result = num1 * num2;
			System.out.println(result);
		}else if(operatorMath == '-'){
			result = num1 - num2;
			System.out.println(result);
		}else if(operatorMath == '%'){
			if(num1 >= num2){
				result = num1 % num2;
			System.out.println(result);
			}else{
			System.out.println("If num1 less then num2" 
			+ "the result is num1:" +num1);
			}
		}else{
			System.out.println("Wrong Data");
			
		}
		System.out.println("_______");
		
        switch(operatorMath){
        case '+':
        	result = num1 + num2;
        	System.out.println(result);
        	break;
        case '/':
        	result = num1 / num2;
        	System.out.println(result);
        case '-':
        	result = num1 - num2;
        	System.out.println(result);
        case '*':
        	result = num1 * num2;
        	System.out.println(result);
        case '%':
        	if(num1 >= num2){
        	result = num1 % num2;
        	System.out.println(result);
        	}else{
        		System.out.println("If num1 less then num2" 
        				+ "the result is num1:" +num1);
        	}
        	break;
        default:
        		System.out.println("No such number or operator");
        }
	}
}
