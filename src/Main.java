import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Başak","Karaca");
		List<Credit> credits = new ArrayList<Credit>();
		credits.add(new NeedCredit());
		credits.add(new CarCredit());
		credits.add(new OfficerCredit());
		
		Application application = new Application(credits);
		application.calculate(1,20000, customer1);

	}

}

//CreditCalculator

//Application
//Credit

//Müşteriler kredi hesabı talebinde bulunabilir. calculate
//Aynı anda birden fazla kredi hesabı dönüşü raporlanmalıdır.
//Kredi geçilmezse uyarı vermelidir. "En az bir kredi seçmelisiniz"


//Yearly
//Officer--> 50.000/%20
//Car--> 50.000/%18
//Need-->50.000/%21