import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class Student 
{
    String firstName, lastName;
    double grade1, grade2, grade3;

    public Student(String firstName, String lastName, String grade1, String grade2, String grade3)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade1 = convertToGPA(grade1);
        this.grade2 = convertToGPA(grade2);
        this.grade3 = convertToGPA(grade3);
    }

    // Convert letter grade to GPA
    private double convertToGPA(String grade) 
    	{
        switch (grade) 
        {
            case "A+": return 4.3;
            case "A": return 4.0;
            case "A-": return 3.7;
            case "B+": return 3.3;
            case "B": return 3.0;
            case "B-": return 2.7;
            case "C+": return 2.3;
            case "C": return 2.0;
            case "C-": return 1.7;
            case "D+": return 1.3;
            case "D": return 1.0;
            case "D-": return 0.7;
            default: return 0.0; // F or invalid grades
        }
    }

    // Calculate average GPA
    public double getGPA() 
    {
        return (grade1 + grade2 + grade3) / 3.0;
    }

    // Display student info
    public String toString()
    {
        return firstName + " " + lastName + " | GPA: " + String.format("%.2f", getGPA());
    }
}

public class StudentSorter 
{
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) throws IOException 
    {
        getStudentList();
        sortStudents();
    }

    // Read students from file
    public static void getStudentList() throws IOException 
    {
        Scanner file = new Scanner(new File("StudentList.txt"));
        while (file.hasNextLine()) 
        {
            String[] data = file.nextLine().split(","); // Split by commas
            if (data.length == 5) 
            {
                students.add(new Student(data[0], data[1], data[2], data[3], data[4]));
            }
        }
        file.close();
    }

    // Ask user how to sort
    public static void sortStudents() 
    	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Sort by last name");
        System.out.println("2) Sort by GPA");
        String choice = scanner.nextLine();

        if (choice.equals("1")) 
        	{
            students.sort(Comparator.comparing(s -> s.lastName));
        }
        else if (choice.equals("2")) 
        {
            students.sort(Comparator.comparing(Student::getGPA).reversed());
        } 
        else 
        {
            System.out.println("Invalid choice.");
            return;
        }

        System.out.println("Sorted Students:");
        for (Student s : students) 
        {
            System.out.println(s);
        }

        scanner.close();
    }
}






//public class StudentSorter
//	{
//		public static void sortStudents()
//			{
//				Scanner choice = new Scanner(System.in);
//				System.out.println("1) Sort by last name");
//				System.out.println("2) Sort by GPA");
//				System.out.println("3) Sort by period");
//				String choiceC= choice.nextLine();
//				if(choiceC.equals("1"))
//					{
//						sortLastName();
//					}
//				else if(choiceC.equals("2"))
//					{
//						sortGPA();
//					}
//				else if(choiceC.equals("3"))
//					{
//						sortPeriod();
//					}
//			}
//		
//			ArrayList<StudentSorter> students = new ArrayList<>();
//			public static void main(String[]args) throws IOException
//			{
//			getStudentList();
//			sortStudents();
//			}
//	
//		public static void getStudentList() throws IOException
//		{
//			Scanner fileScanner = new Scanner(new File("StudentList.txt"));
//			while(fileScanner.hasNextLine())
//				{
//					
//				}
//		}
//		
//
//		
//		public static void sortLastName()
//		{
////			ArrayList<StudentList> Student = new ArrayList<>();
////			getTextFile();
////		}
////		
////	public static void getTextFile() throws IOException
////	{
////		Scanner file = new Scanner(new File("newTextFile.txt"));
////		while(file.hasNext())
////			{
////				String firstName = file.next();
////				Student.add(new Student(String f, String l))
////			    System.out.println(firstName);
//		}
//		
//		public static void sortGPA()
//		{
//				//ufhuvbjdvj
//		}
//		public static void sortPeriod()
//		{
//			//isegvv
//		}
//	}