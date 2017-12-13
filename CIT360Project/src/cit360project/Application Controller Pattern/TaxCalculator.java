public class TaxCalculator {
	
	public void doCalc(Budget budget, Tax anyTax) {
		
		double tax1 = anyTax.calc(budget);
		System.out.println(tax1);
		}
}