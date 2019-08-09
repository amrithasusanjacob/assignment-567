import java.util.Date;

public class hydro extends bill 
{
	private String agencyName;
	private int unitsConsumed;

	public hydro(int billId, Date billDate, String billType, double totalbillAmount, String agencyName,int unitsConsumed) 
	{
		super(billId, billDate, billType, totalbillAmount);
		this.agencyName = agencyName;
		this.unitsConsumed = unitsConsumed;
	}

	
	public String getAgencyName() 
	{
		return agencyName;
	}

	public void setAgencyName(String agencyName) 
	{
		this.agencyName = agencyName;
	}

	public int getUnitsConsumed() 
	{
		return unitsConsumed;
	}

	public void setUnitsConsumed(int unitsConsumed) 
	{
		this.unitsConsumed = unitsConsumed;
	}

	@Override
	public void display() 
	{
		super.display();
		System.out.println("Agency Name : " + agencyName);
		System.out.println("Unit Consumed :" + unitsConsumed + " Units");
		
	}
}