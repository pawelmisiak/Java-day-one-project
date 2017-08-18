public class DayProgram		//check what mod does
{
	final static int SUN = 0;
	final static int MON = 1;
	final static int TUE = 2;
	final static int WED = 3;
	final static int THU = 4;
	final static int FRI = 5;
	final static int SAT = 6;

	public int ourDay;         

	public DayProgram(int ourDay)
	{
		this.ourDay = ourDay;
	}

	public void setDay(int ourDay)
	{
		this.ourDay = ourDay;
	}         

	public int getDay()
	{
		return ourDay;
	}

	public int followingDay()
	{
			if (ourDay == SAT)
				return SUN;

			else 
				ourDay = (ourDay + 1) % 7;            
			return ourDay;           
	}                  

	public int previousDay() 
	{
			if (ourDay == 0)
				return SAT;

			else 
				ourDay = (ourDay - 1) % 7;
			return ourDay;           
	}       

	public int futureDay(int ourDays) 
	{
		return ((ourDay + ourDays) -1 ) % 7;
	}

	public String toString()     
	{
			switch (this.ourDay) 
				 {
						case SUN:
									return "Sunday";
						case MON:
									return "Monday";
						case TUE:
									return "Tuesday";
						case WED:
									return "Wednesday";
						case THU:
									return "Thursday";
						case FRI:
									return "Friday";
						case SAT:
									return "Saturday";
					}
						return "";
	}    

	public static void main(String[] args) 
	{
					DayProgram theDay = new DayProgram(SUN);                
					System.out.print("The current day: " + theDay);                
					System.out.println();
					
					theDay.setDay(theDay.previousDay());
					System.out.print("The previous day: " + theDay);                               
					System.out.println();
					
					theDay.setDay(theDay.followingDay());                
					theDay.setDay(theDay.followingDay());
					System.out.print("The next day: " + theDay);              
					System.out.println();                       
					        
					theDay.setDay(theDay.futureDay(10));
					System.out.print("10 days later: " + theDay);               
					System.out.println();    
					
	}
}