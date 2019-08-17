package example;

public class Bank1 implements loan1 {

	@Override
	public void HomeLoan() {
	
		System.out.println("rate of interest 8 %");
		
	}

	@Override
	public void educationLoan() {
		
		System.out.println("rate of interest 9 %");		
	}

	@Override
	public void jewelLoan() {
		
		System.out.println("rate of interest 10 %");
	}
	
	public static void main(String[] args) {
		
		Bank1 obj=new Bank1();
		obj.educationLoan();
	obj.jewelLoan();
	obj.HomeLoan();
	}

}
