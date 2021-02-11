package pl.bjsoft.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class StrategyPatternTest {

	public static void main(String[] args) {

		List<Context> calcs = new ArrayList<Context>();
		calcs.add(new Context(new OpeartionEuro(0.9)));
		calcs.add(new Context(new OperationDollar(0.6)));

		calcs.forEach(b -> {
			System.out.println(b.executeCalculation(new BigDecimal(20)));
		});

	}

}
