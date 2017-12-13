public class Tax1 implements Tax {
	
	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.1; //Calc 10%
	}
}