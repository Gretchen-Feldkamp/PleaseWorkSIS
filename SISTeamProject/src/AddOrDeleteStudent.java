import java.util.Scanner;


public class AddOrDeleteStudent
	{

		public static void studentMain()
			{
				Scanner answer= new Scanner(System.in);
				System.out.println("Welcome! Would you like to:");
				System.out.println("1. Add a student");
				System.out.println("2. Delete a student");
				String answerA = answer.nextLine();
				if(answerA.equals("1"))
					{
						op1();
					}
				else if(answerA.equals("2"))
					{
						op2();
					}
				else
					{
						System.out.println("Please select a valid option.");
						studentMain();
					}
			}
		public static void op1()
		{
			System.out.println("Please list your student's full name:");
			Scanner a1 = new Scanner(System.in);
			String studeName=a1.nextLine();
			System.out.println("First period class and letter grade:");
			
		}
		
		public static void op2()
		{
			System.out.println("2");
		}

	}
