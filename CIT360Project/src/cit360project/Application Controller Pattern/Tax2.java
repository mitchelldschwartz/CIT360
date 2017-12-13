public class Tax2 implements Tax {
	
	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.06; //Calc 6%
	}
}