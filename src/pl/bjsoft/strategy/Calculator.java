package pl.bjsoft.strategy;
import java.math.BigDecimal;

/**
 * Strategy main interface. It defines all methods that concrete strategy class must implement.
 * @author Bartosz Jancz
 *
 */
public interface Calculator {

	public BigDecimal calculate(BigDecimal amount);
	
}
