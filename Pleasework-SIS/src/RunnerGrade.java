import java.util.Scanner;

public class RunnerGrade
	{
		public static void Gradmain ()
			{

				Scanner scanner = new Scanner(System.in);
				int number = scanner.nextInt();
				
				System.out.println("Would you like to:");
				System.out.println("1. Change Grade");
				System.out.println("2. Switch Classes");
				
				if(number == 1)
					{
						System.out.println("Which grade would you like to change?");
					}
				else if(number == 2)
					{
						System.out.println("Which class would you like to change?");
					}
				else
					{
						System.out.println("That is not an option.");
						Gradmain();
					}

			}

	}