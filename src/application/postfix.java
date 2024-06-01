// proj 3
// Byan Alkas & Amal Mohamed


package application;

import java.util.ArrayList;
import java.util.Stack;

public class postfix {

	   String expr;
	   Stack<Double> stack;
	   ArrayList<postfix> list = new ArrayList<postfix>(); // create an array to split the numbers.
	   
	   public class error extends RuntimeException{
	   }

	   public postfix(String e)
	   {
	      expr = e; // Initialize expr.
	      stack = new Stack<Double>();
	   } //constructor 

	   public double eval()
	   {
	      String[] tokens = expr.split(" ");
	      for (String token : tokens)
	      {
	         double x, y; // create variables. 
	         switch(token)
	         {
	            case "+": // addition
	               x = stack.pop();
	               y = stack.pop();
	               stack.push(x + y);
	               break;
	            case "-": // subtraction
	               x = stack.pop();
	               y = stack.pop();
	               stack.push(x - y);
	               break;
	            case "*": // multiplication
	               x = stack.pop();
	               y = stack.pop();
	               stack.push(x * y);
	               break;
	            case "/": // division
	               x = stack.pop();
	               y = stack.pop();
	               stack.push(x / y);
	               break;
	            default: // must be a number
	                try
	                {
	                   stack.push(Double.parseDouble(token));
	                }
	                catch (java.lang.NumberFormatException e)
	                {
	                   throw new error();
	                }
	         }
	      }
	      return stack.peek();
	   }
}