package cit360.spring2017.acp_test;

import cit360.spring2017.acp_calculator.TaxCalculator;
import cit360.spring2017.acp_example.Budget;
import cit360.spring2017.acp_interface.Tax;
import cit360.spring2017.acp_taxes.Tax1;
import cit360.spring2017.acp_taxes.Tax2;
import cit360.spring2017.acp_taxes.Tax3;
import cit360.spring2017.acp_taxes.Tax4;
import cit360.spring2017.acp_taxes.Tax5;

public class TestTax {

	public static void main(String[] args) {
		Tax tax1 = new Tax1();
		Tax tax2 = new Tax2();
		Tax tax3 = new Tax3();
		Tax tax4 = new Tax4();
		Tax tax5 = new Tax5();
		
		Budget budget  = new Budget(500.00);
		
		TaxCalculator calculator = new TaxCalculator();
		
		calculator.doCalc(budget, tax1);
		calculator.doCalc(budget, tax2);
		calculator.doCalc(budget, tax3);
		calculator.doCalc(budget, tax4);
		calculator.doCalc(budget, tax5);
	}
}