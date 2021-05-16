package SpringCore.SpringCore7;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class application {
	 public static void main( String[] args )
	    {
	        
	    	ExpressionParser expressionParser = new SpelExpressionParser();

	        Expression expression = expressionParser.parseExpression("'AAA'");
	        String strVal = expression.getValue(String.class);
	        System.out.println( strVal);
	    	  

	    }

}
