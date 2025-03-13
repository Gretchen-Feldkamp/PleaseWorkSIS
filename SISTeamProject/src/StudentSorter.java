import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentSorter
	{
		public static void main (String args[]) throws IOException
		{
			ArrayList<StudentSorter> Student = new ArrayList<>();
			getStudentList();
			sortStudents();
		}
		public static void getStudentList() throws IOException
		{
			Scanner Student = new Scanner(new File("StudentList.txt"));
		}
		
		public static void sortStudents()
		{
			Scanner choice = new Scanner(System.in);
			System.out.println("1) Sort by last name");
			System.out.println("2) Sort by GPA");
			System.out.println("3) Sort by period");
			String choiceC= choice.nextLine();
			if(choiceC.equals("1)"))
				{
					
				}
		}
	}
