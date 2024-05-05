public abstract class School {

protected String name;
protected int id;
private int numOfCourses;
private Courses [] listC ;

public School(String name, int id) {

this.name = name;
this.id = id;
numOfCourses = 0;
Courses [] listC = new Courses [6];

}

public boolean addCourses(Courses c) {

if ( numOfCourses < listC.length ) {
listC[numOfCourses++] = c ;
return true;
}
else 
return false;

}  

public abstract double calculateSalary();


public String toString() {

return "Name: " + name + "\nID: " + id;

}

// Getters 

public String getName() {

return name;

}


public int getId() {

return id;

}

   
}

