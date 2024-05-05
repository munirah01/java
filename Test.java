
import java.util.Scanner;
public class Test {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);


// Creating a course
Courses course = new Courses("Math", 101 , 10);

// Adding students to the course
Student student1 = new Student("John Doe", 1001);
Student student2 = new Student("Jane Smith", 1002);
Student student3 = new Student("David Scott", 1003);
course.addStudent(student1);
course.addStudent(student2);
course.addStudent(student3);

Mangement mangement = new Mangement();
// Adding teacher 
Teachers teacher1 = new Teachers("Mr. Smith", 2001, "Ph.D.", 10);
Teachers teacher2 = new Teachers("Mr. Micle", 2002, "master", 7);
mangement.addEmp(teacher1);
mangement.addEmp(teacher2);

// Adding manager
Managers manager = new Managers("Ms. Johnson", 3001, 5);
mangement.addEmp(manager);

// Menu-driven interaction

int choice;
do {
System.out.println("\n************* School Management System *************");
System.out.println("\n Choose 1 to 8 ");
System.out.println("1. add new Student");
System.out.println("2. Display Course Info");
System.out.println("3. Display Teacher Info");
System.out.println("4. Display Manager Info");
System.out.println("5. Search Student");
System.out.println("6. Search Teacher");
System.out.println("7. Sum Salary of Teacher");
System.out.println("8. Exit");

System.out.print("Enter your choice: ");
choice = input.nextInt();
input.nextLine();

switch (choice) {

case 1:

System.out.println("enter name:");
String name = input.nextLine();
System.out.println("enter id:");
int id = input.nextInt();
Student student4 = new Student(name,id);
if (course.addStudent(student4) )
System.out.println("done");
else
System.out.println("can't add");
break;

case 2:

System.out.println(course.toString());

break;

case 3:

System.out.println("Teachers Information");
System.out.println(teacher1.toString());
System.out.println(teacher2.toString());

break;

case 4:

System.out.println("Manager Information");
System.out.println(manager.toString());

break;

case 5:

System.out.println(course.searchStudent("John Doe"));

break;

case 6 :

System.out.println(mangement.findEmployee(2002));

break;

case 7 :

System.out.println("The sum of teachers salary: "+mangement.SumTeachersSalary());

break;

default:
System.out.println("Invalid input. Please enter a number between 1 and 7.");

}
} while (choice != 8);

}
}
