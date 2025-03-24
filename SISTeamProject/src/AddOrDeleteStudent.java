import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


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
			try
				{
//			Scanner myFile = new Scanner(new File("StudentList.txt"));
//			ArrayList<String> studentList = new ArrayList<Student>();
//			while(myFile.hasNext())
				{
					
				}
			
				}
			catch(NullPointerException x)
				{
				System.out.println("No more students.");
				}
			catch(FileNotFoundException y)
				{
				System.out.println("No file found.");
				}
		}
		
		public static void op2()
		{
			System.out.println("2");
		}

	}
