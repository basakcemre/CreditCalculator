
public class OfficerCredit implements Credit {

	@Override
	public void calculate(int year, double amount,Customer customer) {
		double faiz=0.20;
		double rate = amount*faiz;
		
		
		for(int i=0;i<year;i++) {
			amount=amount+rate;
		}
		
		System.out.println("OfficerCredit: "+amount);
		
	}

}
