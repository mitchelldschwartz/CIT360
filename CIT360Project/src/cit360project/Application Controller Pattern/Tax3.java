public class Tax3 implements Tax {
	
	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.08; //Calc 8%
	}
}