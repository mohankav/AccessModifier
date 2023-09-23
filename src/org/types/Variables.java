package org.types;

public interface Variables {
	
	int a=1452;
	
	// global variable 
	// it can be override  the another class
	
	void employeeId(int a);
	
	// static variable 
	// static method can't override the another class
	// in same class we can directly method name only 
	
	public static void employeeName() {
		System.out.println("Employee name is Kaaviyan");
	}
	
	 public void employeLocation();

}
