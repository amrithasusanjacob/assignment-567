 import java.util.Date;
public class bill implements iDisplay
{
		private int billId;
		private Date billDate;
		private String billType;
		private double totbillAmount;
		
		public bill(int billId, Date billDate, String billType, double totbillAmount) 
		{
			this.billId = billId;
			this.billDate = billDate;
			this.billType = billType;
			this.totbillAmount = totbillAmount;
		}
		
		public int getBillId() 
		{
			return billId;
		}

		public void setBillId(int billId) 
		{
			this.billId = billId;
		}

		public Date getBillDate() 
		{
			return billDate;
		}

		public void setBillDate(Date billDate) 
		{
			this.billDate = billDate;
		}

		public String getBillType() 
		{
			return billType;
		}

		public void setBillType(String billType) 
		{
			this.billType = billType;
		}

		public double getTotalbillAmount() 
		{
			return totbillAmount;
		}

		public void setTotalbillAmount(double totalbillAmount)
		{
			this.totbillAmount = totalbillAmount;
		}

		@Override
		public void display() 
		{
			System.out.println("Bill Id :" + billId);
			System.out.println("Bill Date :" + billDate);
			System.out.println("Bill Type :" + billType);
			System.out.println("Total Bill Amount : $" + totbillAmount);
		}

}