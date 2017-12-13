public class Tax5 implements Tax{
	
	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.25; //Calc 25%
	}
}