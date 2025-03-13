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
			Scanner myFile = new Scanner(new File("StudentList.txt"));
			while(myFile.hasNext())
				{
				String sentence = myFile.nextLine();
				}
			catch()
			
//			System.out.println("Please list your student's full name:");
//			Scanner a1 = new Scanner(System.in);
//			String a1a = a1.nextLine();
//			String[] studeName=a1a.split(" ");
//			//first period[1] is the first name
//			//first period[2] is the last name
//			System.out.println("First period class and letter grade:");
//			Scanner a2=new Scanner(System.in);
//			String clasUno=a2.nextLine();
//			String[] firstPeriod=clasUno.split(" ");
//			//first period[1] is the class name
//			//first period[2] is the letter grade
//			System.out.println("Second period class and letter grade:");
//			Scanner a3=new Scanner(System.in);
//			String clasDos = a3.nextLine();
//			String[] secondPeriod=clasDos.split(" ");
//			//second period[1] is the class name
//			//second period[2] is the letter grade
//			System.out.println("Third period class and letter grade:");
//			Scanner a4=new Scanner(System.in);
//			String clasTres=a4.nextLine();
//			String[] ThirdPeriod=clasTres.split(" ");
//			//third period[1] is the class name
//			//third period[2] is the letter grade
//			System.out.println(studeName[0]);
//			System.out.println(studeName[1]);
//			System.out.println(firstPeriod[0]);
//			System.out.println(firstPeriod[1]);
//			System.out.println(secondPeriod[0]);
//			System.out.println(secondPeriod[1]);
//			System.out.println(ThirdPeriod[0]);
//			System.out.println(ThirdPeriod[1]);
			
		}
		
		public static void op2()
		{
			System.out.println("2");
		}

	}
