import java.util.Date;

public class mobile extends bill 
{
	private String mobileManufacturerName;
	private String planName;
	private int mobileNumber;
	private double internetgbUsed;
	private int minutesUsed;

	public mobile(int billId, Date billDate, String billType, double totalbillAmount, String mobileManufacturerName,
			String planName, int mobileNumber, double internetgbUsed, int minutesUsed) {
		super(billId, billDate, billType, totalbillAmount);
		this.mobileManufacturerName = mobileManufacturerName;
		this.planName = planName;
		this.mobileNumber = mobileNumber;
		this.internetgbUsed = internetgbUsed;
		this.minutesUsed = minutesUsed;
	}

	public String getMobileModelName() 
	{
		return mobileManufacturerName;
	}

	public void setMobileModelName(String mobileManufacturerName) 
	{
		this.mobileManufacturerName = mobileManufacturerName;
	}

	public String getPlanName() 
	{
		return planName;
	}

	public void setPlanName(String planName) 
	{
		this.planName = planName;
	}

	public int getMobileNumber() 
	{
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}

	public double getDataUsed() 
	{
		return internetgbUsed;
	}

	public void setDataUsed(double internetgbUsed) 
	{
		this.internetgbUsed = internetgbUsed;
	}

	public int getMinutesUsed() 
	{
		return minutesUsed;
	}

	public void setMinutesUsed(int minutesUsed) 
	{
		this.minutesUsed = minutesUsed;
	}

	@Override
	public void display()
	{
		super.display();
		System.out.println("Name of manufacturer : " + mobileManufacturerName);
		System.out.println("Name of plan : " + planName);
		System.out.println("Mobile Number : " + mobileNumber);
		System.out.println("Internet Usage : " + internetgbUsed + " GB");
		System.out.println("Minutes Usage : " + minutesUsed + " minutes");
	}
}