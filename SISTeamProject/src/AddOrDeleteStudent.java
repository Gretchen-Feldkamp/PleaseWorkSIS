import java.util.ArrayList;
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
			String studFile = myFile.next();
			ArrayList<Student> studentList = new ArrayList<Student>();
			while(myFile.hasNext())
				{
				String[] prevStud = studFile.split(" ");
				studentList.add(new Student(prevStud[0], prevStud[1], prevStud[2], prevStud[3], prevStud[4], prevStud[5], prevStud[6], prevStud[7]));
				}
				System.out.println("Please enter your student's fullname,"
						+ " first period class, grade for first period,"
						+ " second period class, grade for second period,"
						+ " third period class, and grade for third period.");
				Scanner studi = new Scanner(System.in);
				String stud = studi.nextLine();
				String[] studInfo = stud.split(" ");
				studentList.add(new Student(studInfo[0], studInfo[1], studInfo[2], studInfo[3], studInfo[4], studInfo[5], studInfo[6], studInfo[7]));
				System.out.println(studentList.size()-1);
				}
			catch(NullPointerException x)
				{
				System.out.println("No more students.");
				}
			catch(FileNotFoundException y)
				{
				System.out.println("No file found.");
				}
			catch(ArrayIndexOutOfBoundsException z)
				{
				System.out.println("Out of bounds.");
				z.printStackTrace();
				}
		}
		
		public static void op2()
		{
			System.out.println("2");
		}

	}
