import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


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
					StudentArrayMaker.armain();
				System.out.println("Please enter your student's fullname,"
						+ " first period class, grade for first period,"
						+ " second period class, grade for second period,"
						+ " third period class, and grade for third period.");
				Scanner studi = new Scanner(System.in);
				String stud = studi.nextLine();
				String[] studInfo = stud.split(" ");
				StudentArrayMaker.studentList.add(new Student(studInfo[0], studInfo[1], studInfo[2], studInfo[3], studInfo[4], studInfo[5], studInfo[6], studInfo[7]));
				for(Student S: StudentArrayMaker.studentList)
					{
						System.out.print(StudentArrayMaker.counter + ") " + S.getFirstname());
						System.out.print(" " + S.getLastname());
						System.out.print(" " + S.getPeriodone());
						System.out.print(" " + S.getPeriodoneg());
						System.out.print(" " + S.getPeriodTwo());
						System.out.print(" " + S.getPeriodTwog());
						System.out.print(" " + S.getPeriodThree());
						System.out.print(" " + S.getPeriodThreeg());
						System.out.println("");
					}
				}
			catch(NullPointerException x)
				{
				System.out.println("No more students. Try again");
				}
			catch(ArrayIndexOutOfBoundsException z)
				{
				System.out.println("Out of bounds. Try again");
				op1();
				}
		}
		
		public static void op2()
		{
			StudentArrayMaker.armain();
			try
				{
					System.out.println("What student would you like to delete?");
					Scanner studr = new Scanner(System.in);
					int studentIndex = studr.nextInt();
					for(Student S: StudentArrayMaker.studentList)
						{
							
							if(StudentArrayMaker.studentList.contains(studentIndex))
								{
									System.out.println("Found the student!");
									((Collection<Student>) S).remove(studentIndex);
									for(Student T: StudentArrayMaker.studentList)
										{
											System.out.print(T.getFirstname());
											System.out.print(" " + T.getLastname());
											System.out.print(" " + T.getPeriodone());
											System.out.print(" " + T.getPeriodoneg());
											System.out.print(" " + T.getPeriodTwo());
											System.out.print(" " + T.getPeriodTwog());
											System.out.print(" " + T.getPeriodThree());
											System.out.print(" " + T.getPeriodThreeg());
											System.out.println("");
										}
								}
							else {
								System.out.println("Student doesn't exist. Please enter a different student");
								op2();
							}
						}
				}
			catch(NullPointerException x)
				{
					System.out.println("No more students. Try again");
					op2();
				}
			catch(ArrayIndexOutOfBoundsException z)
				{
				System.out.println("Out of bounds. Try again");
				op2();
				}
		}

	}