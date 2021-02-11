package pl.bjsoft.strategy;
import java.math.BigDecimal;

/**
 * This class is not really necessary but might be useful for preconditions etc.
 * @author Bartosz Jancz
 *
 */
public class Context {
	   private Calculator calculator;

	   public Context(Calculator calculator){
	      this.calculator = calculator;
	   }

	   public BigDecimal executeCalculation(BigDecimal num1){
	      return calculator.calculate(num1);
	   }
	}