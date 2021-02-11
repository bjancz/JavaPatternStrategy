package pl.bjsoft.strategy;

import java.math.BigDecimal;

/**
 * Concrete strategy implementation
 * 
 * @author Bartosz Jancz
 *
 */
public class OperationDollar implements Calculator {

	private double _rate;

	public OperationDollar(double rate) {
		this._rate = rate;
	}

	@Override
	public BigDecimal calculate(BigDecimal amount) {
		
		return new BigDecimal(String.valueOf(amount.doubleValue() * _rate));
	}

}
