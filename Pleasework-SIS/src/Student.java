
public class Student
	{
		private String Firstname;
		private String Lastname;
		private String Periodone;
		private String Periodoneg;
		private String PeriodTwo;
		private String PeriodTwog;
		private String PeriodThree;
		private String PeriodThreeg;
		private int Index;
		
		public Student(int index, String firstname, String lastname, String periodone, String periodoneg, String periodTwo,
				String periodTwog, String periodThree, String periodThreeg)
			{
				super();
				Index = index;
				Firstname = firstname;
				Lastname = lastname;
				Periodone = periodone;
				Periodoneg = periodoneg;
				PeriodTwo = periodTwo;
				PeriodTwog = periodTwog;
				PeriodThree = periodThree;
				PeriodThreeg = periodThreeg;
			}
		public int getIndex()
			{
				return Index;
			}

		public void setIndex(int index)
			{
				Index = index;
			}

		public String getFirstname()
			{
				return Firstname;
			}

		public void setFirstname(String firstname)
			{
				Firstname = firstname;
			}

		public String getLastname()
			{
				return Lastname;
			}

		public void setLastname(String lastname)
			{
				Lastname = lastname;
			}

		public String getPeriodone()
			{
				return Periodone;
			}

		public void setPeriodone(String periodone)
			{
				Periodone = periodone;
			}

		public String getPeriodoneg()
			{
				return Periodoneg;
			}

		public void setPeriodoneg(String periodoneg)
			{
				Periodoneg = periodoneg;
			}

		public String getPeriodTwo()
			{
				return PeriodTwo;
			}

		public void setPeriodTwo(String periodTwo)
			{
				PeriodTwo = periodTwo;
			}

		public String getPeriodTwog()
			{
				return PeriodTwog;
			}

		public void setPeriodTwog(String periodTwog)
			{
				PeriodTwog = periodTwog;
			}

		public String getPeriodThree()
			{
				return PeriodThree;
			}

		public void setPeriodThree(String periodThree)
			{
				PeriodThree = periodThree;
			}

		public String getPeriodThreeg()
			{
				return PeriodThreeg;
			}

		public void setPeriodThreeg(String periodThreeg)
			{
				PeriodThreeg = periodThreeg;
			}
		
	}