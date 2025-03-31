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
static int counter = 0;
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
					for(Student S: StudentArrayMaker.studentList)
						{
							counter ++;
							System.out.print(counter + ". " + S.getFirstname());
							System.out.print(" " + S.getLastname());
							System.out.println("");
						}
				System.out.println("Please enter your student's fullname,"
						+ " first period class, grade for first period,"
						+ " second period class, grade for second period,"
						+ " third period class, and grade for third period.");
				Scanner studi = new Scanner(System.in);
				String stud = studi.nextLine();
				String[] studInfo = stud.split(" ");
				StudentArrayMaker.studentList.add(new Student(counter, studInfo[0], studInfo[1], studInfo[2], studInfo[3], studInfo[4], studInfo[5], studInfo[6], studInfo[7]));
				counter=0;
				for(Student S: StudentArrayMaker.studentList)
					{
						counter++;
						System.out.print(counter + ". " + S.getFirstname());
						System.out.print(" " + S.getLastname());
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
					for(Student S: StudentArrayMaker.studentList)
					{
						counter ++;
						System.out.print(counter + ") " + S.getFirstname());
						System.out.print(" " + S.getLastname());
						System.out.println("");
					}
					System.out.println("What student would you like to delete?");
					Scanner studr = new Scanner(System.in);
					int studentIndex = studr.nextInt();
							counter=StudentArrayMaker.studentList.get(studentIndex).getIndexstud();
							StudentArrayMaker.studentList.remove(studentIndex-1);
							for(Student S: StudentArrayMaker.studentList)
								{
									counter ++;
									System.out.print(counter + ") " + S.getFirstname());
									System.out.print(" " + S.getLastname());
									System.out.println("");
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