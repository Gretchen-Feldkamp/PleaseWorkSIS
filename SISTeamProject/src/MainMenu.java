import java.util.Scanner;
public class MainMenu
	{
		public static void main (String args[])
		{
		q1();
		}
		public static void q1()
		{
			Scanner answer= new Scanner(System.in);
			System.out.println("Welcome! What would you like to do?");
			System.out.println("1. Add or Delete a student");
			System.out.println("2. Change student Grades/Schedule");
			System.out.println("3. Sort students");
			String answerS = answer.nextLine();
			if(answerS.equals("1"))
				{
					
				}

		}
	}
