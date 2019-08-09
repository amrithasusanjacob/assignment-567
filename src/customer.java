import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class customer implements iDisplay 
{

	private int customerId;
	private String fName;
	private String lName;
	private String email;
	private ArrayList<bill> bills;
	
	public customer(int customerId, String fName, String lName, String email) 
	{
		this.customerId = customerId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
	}

	public int getCustomerId() 
	{
		return customerId;
	}

	public void setCustomerId(int customerId) 
	{
		this.customerId = customerId;
	}

	public String getFirstName() {
		return fName;
	}

	public void setFirstName(String fName) 
	{
		this.fName = fName;
	}

	public String getLastName() 
	{
		return lName;
	}

	public void setLastName(String lName) 
	{
		this.lName = lName;
	}

	public String getEmailID() 
	{
		return email;
	}

	public void setEmailID(String email) 
	{
		this.email = email;
	}

	public ArrayList<bill> getBills() 
	{
		return bills;
	}

	public void setBills(ArrayList<bill> bills) 
	{
		this.bills = bills;
	}

	public String FullName() 
	{
		return fName + " " + lName;
	}

	public double getTotalBill() 
	{
		if (bills == null || bills.size() == 0)
			return 0;

		double total = 0;
		for (bill bill : bills) 
		{
			total += bill.getTotalbillAmount();
		}
		return total;
	}

	@Override
	public void display() {
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Full Name : " + this.FullName());
		System.out.println("Customer Email : " + email);
		if (this.getTotalBill() == 0) 
		{
			System.out.println(" No existing bills to display ");
			System.out.println("*************************************************");
			return;
		}
		System.out.println("              Bill Information               ");
		System.out.println("****************************************************");
		Collections.sort(this.bills, new BillComparator());
		for (bill bill : this.bills) 
		{
			bill.display();
		}
		System.out.println("    Total Amount to Pay: $" + this.getTotalBill());
		System.out.println("****************************************************");

	}

}

class BillComparator implements Comparator<bill> 
{

	@Override
	public int compare(bill b1, bill b2) 
	{
		if (b1.getBillId() < b2.getBillId()) 
		{
			return -1;
		} 
		else if (b1.getBillId() > b2.getBillId()) 
		{
			return 1;
		} 
		else 
		{
			return 0;
		}
	}

}