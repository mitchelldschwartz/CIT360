package cit360.spring2017.acp_taxes;

import cit360.spring2017.acp_example.Budget;
import cit360.spring2017.acp_interface.Tax;

public class Tax3 implements Tax {
	
	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.08; //Calc 8%
	}
}