import java.util.ArrayList;
import java.util.Date;

public class main 
{
	public static void main(String[] args) 
	{
		customer John = new customer(1, "John", "Doe", "johndoe@gmail.com");
		bill b1 = new hydro(1, new Date(), "Hydro", 25.6, "hydroInc", 55);
		bill b2 = new internet(2, new Date(), "Internet", 5, "freedom", 100);
		bill b3 = new mobile(3, new Date(), "Mobile",57, "pixel 3","Prepaid",648163333, 1.5, 260);
		ArrayList<bill> bills = new ArrayList<>();
		bills.add(b2);
		bills.add(b1);
		bills.add(b3);
		John.setBills(bills);

		customer james = new customer(2, "james", "Philop", "jamesphil@ymail.com");
		bill b4 = new hydro(1, new Date(), "Hydro", 50, "HydroInc", 55);
		bill b5 = new internet(2, new Date(), "Internet", 40, "RogersMobile", 100);
		ArrayList<bill> bills1 = new ArrayList<>();
		bills1.add(b4);
		bills1.add(b5);
		james.setBills(bills1);

		customer house = new customer(10, "house", "gregory", "gregoryhouse@hotmail.com");

		customerList cus = new customerList();
		cus.addCustomer(John);
		cus.addCustomer(james);
		cus.addCustomer(house);
		cus.display();

		System.out.println("\nSearching for a valid customer");
		customer c1 = cus.getCustomerById(1);
		c1.display();

		
		System.out.println("\nSearching for an invalid customer");
		customer c2=cus.getCustomerById(5);
	}
}
