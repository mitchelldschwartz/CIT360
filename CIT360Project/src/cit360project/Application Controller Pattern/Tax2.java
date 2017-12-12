package cit360.spring2017.acp_taxes;

import cit360.spring2017.acp_example.Budget;
import cit360.spring2017.acp_interface.Tax;

public class Tax2 implements Tax {
	
	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.06; //Calc 6%
	}
}