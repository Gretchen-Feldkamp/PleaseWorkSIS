import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayMaker
	{
		static ArrayList<Student> studentList = new ArrayList<Student>();
		public static void main(String[] args)
		{
			
		}

		public static void armain()
			{
				try
					{
				Scanner myFile = new Scanner(new File("StudentList.txt"));
				while(myFile.hasNext())
					{
					String nextLn = myFile.nextLine();
					String[] studInfoMaster = nextLn.split(" ");
					studentList.add(new Student(studInfoMaster[0], studInfoMaster[1], studInfoMaster[2], studInfoMaster[3], studInfoMaster[4], studInfoMaster[5], studInfoMaster[6], studInfoMaster[7]));
					}
				for(Student S: studentList)
					{
						System.out.print(S.getFirstname());
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
	}
