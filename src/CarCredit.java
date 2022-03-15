
public class CarCredit implements Credit{

	@Override
	public void calculate(int year, double amount,Customer customer) {
		double faiz=0.18;
		double rate = amount*faiz;
		
		
		
		for(int i=0;i<year;i++) {
			amount=amount+rate;
		}
		
		System.out.println("CarCredit: "+amount);
	}

}
