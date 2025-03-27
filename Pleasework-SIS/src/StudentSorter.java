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
            default: return 0.0; 
        }
    }


    public double getGPA() 
    {
        return (grade1 + grade2 + grade3) / 3.0;
    }


    public String toString()
    {
        return firstName + " " + lastName + " | GPA: " + String.format("%.2f", getGPA());
    }
}

public class StudentSorter 
{
    static ArrayList<Student> studentList = new ArrayList<Student>();

    public static void main(String[] args) throws IOException 
    {
        getStudentList();
        sortStudents();
    }


    public static void getStudentList() throws IOException 
    {
        Scanner file = new Scanner(new File("StudentList.txt"));
        while (file.hasNextLine()) 
        {
            String[] data = file.nextLine().split(","); // Split by commas
            if (data.length == 5) 
            {
                studentList.add(new Student(data[0], data[1], data[2], data[3], data[4]));
            }
        }
        file.close();
    }

    public static void sortStudents() 
    	{
    		        Scanner choice = new Scanner(System.in);
    		        System.out.println("Choose sorting method:");
    		        System.out.println("1) Sort by Last Name");
    		        System.out.println("2) Sort by GPA");
    		        System.out.println("3) Sort by Period");
    		        String choiceC = choice.nextLine();

    		        if (choiceC.equals("1")) 
    		        {
    		            sortLastName();
    		        } 
    		        else if (choiceC.equals("2")) 
    		        {
    		            sortGPA();
    		        } 
    		        else if (choiceC.equals("3")) 
    		        {
    		            sortPeriod();
    		        } 
    		        else 
    		        {
    		            System.out.println("Invalid choice. Exiting.");
    		            return;
    		        }

    		        displayStudents();
    		        choice.close();
    		    }


	public static void sortLastName()
		{

		}
	public static void sortGPA()
		{
		
		}
	public static void sortPeriod()
		{
		
		}
	
	   public static void displayStudents()
		   {
	        for (Student s : studentList)
	        	{
	            System.out.println(s);
	        	}
		   }


}



