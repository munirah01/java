

public class Ceourses {

private String subject;
private int section;
private Student [] listS;
private int numOfSutdents;


public Courses(String subject, int section, int size ) {

this.subject = subject;
this.section = section;
numOfSutdents = 0;
listS = new Student [size];

}

public boolean addStudent(Student student) {

if ( numOfSutdents < listS.length ) {
listS[numOfSutdents++] = student;
return true;
}
else 
return false;

}

public boolean isFull() {

if ( numOfSutdents == listS.length )
return true;
else
return false;

}



public Student searchStudent(String name) {

for (int i = 0 ; i < numOfSutdents ; i++) {
if (listS[i].getName().equalsIgnoreCase(name))

return listS[i];
}
return null;

}

public boolean removeStudent(int loc ) {

if ( loc != -1 )
{
listS[loc] = listS[numOfSutdents-1];
listS[numOfSutdents-1] = null;
numOfSutdents--;
return true;
}
else
return false;
}

    
public String toString() {

String s = "Subject: " + subject + "\nSection: " + section ;
s = s + "\nNumber of Students: " + numOfSutdents+"\n";

for ( int i = 0 ; i<numOfSutdents ; i++)
s = s + listS[i].toString() +"\n";

return s;
}

// Getters and setters
public String getSubject() {

return subject;

}


public int getSection() {

return section;

}


public Student []  getStudents() {

return listS;

}

    
   
}
