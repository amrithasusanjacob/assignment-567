import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class customerList implements iDisplay 
{

	private ArrayList<customer> customers = new ArrayList<>();
	
	public void addCustomer(customer customer) 
	{
		this.customers.add(customer);
	}

	public customer getCustomerById(int id) 
	{
		customer c = null;
		for (customer customer : customers) 
		{
			if (customer.getCustomerId() == id) 
				c = customer;
			
		}

		if (c == null) 
		{
			System.out.println("No customer found with ID : " + id);

		}
		return c;
	}

	@Override
	public void display() 
	{
		Collections.sort(customers, new CustomerComparator());
		for (customer customer : customers) 
		{
			customer.display();
		}
	}

}

class CustomerComparator implements Comparator<customer> 
{

	@Override
	public int compare(customer c1, customer c2) 
	{
		if (c1.getCustomerId() < c2.getCustomerId()) 
		{
			return -1;
		} 
		else if (c1.getCustomerId() > c2.getCustomerId()) 
		{
			return 1;
		}
		else 
		{
			return 0;
		}
	}

}