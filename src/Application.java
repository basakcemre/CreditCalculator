import java.util.List;

public class Application implements Credit {
	private List<Credit> credits;
	
	@Override
	public void calculate(int year, double amount, Customer customer) {
		if(credits.isEmpty()) {
			System.out.println("En az bir kredi girmelisiniz");
		} else {
			for(Credit credit: credits) {
				credit.calculate(year, amount, customer);
				System.out.println(customer.getFirstName()+ " Müşterisine kredi verildi.");
			}
		}
		
	}

	public Application(List<Credit> credits) {
		this.credits = credits;
	}

}
