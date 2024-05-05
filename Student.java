public class Student {

private String name;
private int id;

public Student(String name, int id) {

this.name = name;
this.id = id;

}

public char calculateGrade(double mark) {

char grade = ' ';

while ( mark <= 100 ){
if ( mark >= 90 )
grade = 'A';
else
if ( mark >= 80 )
grade = 'B';
else
if ( mark >= 70 )
grade = 'C';
else
if ( mark >= 60 )
grade = 'D';
else
grade = 'F';
}
return grade;
}

public String toString() {

return "Student Name: " + name + "\nStudent ID: " + id ;

}

// Getters and setters

public String getName() {

return name;

}

public int getId() {

return id;
        
}

    
}
