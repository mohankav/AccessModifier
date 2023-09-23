package org.types1;

public abstract class Company {
	
	
	// final method can not be override in another class 
	// we call in another class only 
	final void companyName(String name) {
		System.out.println("Company name is "+name);
	}
	
	final void companyId(int id) {
		System.out.println("Company Id is "+id);
	}
	
	public  void companyProfit(double profit ) {
		System.out.println("The company profit is "+profit);
	}

	
}
