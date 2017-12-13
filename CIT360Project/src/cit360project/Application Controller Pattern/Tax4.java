public class Tax4 implements Tax{
	
	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.15; //Calc 15%
	}
}