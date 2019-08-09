import java.util.Date;

public class internet extends bill 
{
	private String providerName;
	private double internetgbUsed;
	
	public internet(int billId, Date billDate, String billType, double totalbillAmount, String providerName,double internetgbUsed) 
	{
		super(billId, billDate, billType, totalbillAmount);
		this.internetgbUsed = internetgbUsed;
		this.providerName = providerName;
	}

	public String getProviderName() 
	{
		return providerName;
	}

	public void setProviderName(String providerName) 
	{
		this.providerName = providerName;
	}

	public double getInternetgbUsed() {
		return internetgbUsed;
	}

	public void setInternetgbUsed(double internetgbUsed) 
	{
		this.internetgbUsed = internetgbUsed;
	}
	
	@Override
	public void display() 
	{
		super.display();
		System.out.println("Name of Provider : " + providerName);
		System.out.println("Internet GB Used : " + internetgbUsed + " GB");
		
	}

}