package cit360.spring2017.acp_calculator;

import cit360.spring2017.acp_example.Budget;
import cit360.spring2017.acp_interface.Tax;

public class TaxCalculator {
	
	public void doCalc(Budget budget, Tax anyTax) {
		
		double tax1 = anyTax.calc(budget);
		System.out.println(tax1);
		}
}