package org.types;

public class Interface  implements Variables{

	@Override
	public void employeeId(int a) {
		System.out.println("Employee id "+a);
	}

	@Override
	public void employeLocation() {
		System.out.println("Employee Name is Kaaviyan");
	}
	
	public static void main(String[] args) {
		
		Interface i = new  Interface();
		
		i.employeeId(a);
		i.employeLocation();
		
		// Static method 
		// we can call classname.methodname or extends keyword 
		Variables.employeeName();
		
		
	}

}
