import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class StudentSorter
	{
		public static void sortStudents()
			{
				Scanner choice = new Scanner(System.in);
				System.out.println("1) Sort by last name");
				System.out.println("2) Sort by GPA");
				System.out.println("3) Sort by period");
				String choiceC= choice.nextLine();
				if(choiceC.equals("1"))
					{
						sortLastName();
					}
				else if(choiceC.equals("2"))
					{
						sortGPA();
					}
				else if(choiceC.equals("3"))
					{
						sortPeriod();
					}
			}
		
			ArrayList<StudentSorter> students = new ArrayList<>();
			public static void main(String[]args) throws IOException
			{
			getStudentList();
			sortStudents();
			}
	
		public static void getStudentList() throws IOException
		{
			Scanner fileScanner = new Scanner(new File("StudentList.txt"));
			while(fileScanner.hasNextLine())
				{
					
				}
		}
		

		
		public static void sortLastName()
		{
//			ArrayList<StudentList> Student = new ArrayList<>();
//			getTextFile();
//		}
//		
//	public static void getTextFile() throws IOException
//	{
//		Scanner file = new Scanner(new File("newTextFile.txt"));
//		while(file.hasNext())
//			{
//				String firstName = file.next();
//				Student.add(new Student(String f, String l))
//			    System.out.println(firstName);
		}
		
		public static void sortGPA()
		{
				//ufhuvbjdvj
		}
		public static void sortPeriod()
		{
			//isegvv
		}
	}