
public class Teachers extends School {

private String degree;
private int yearsOfExperience;


public Teachers(String name, int id, String degree, int yearsOfExperience) {
    
super ( name , id );
this.degree = degree;
this.yearsOfExperience = yearsOfExperience;

}

  
public double calculateSalary() {
    
double baseSalary = 30000 ; 
double experienceBonusRate = 1000; 
double degreeBonus = 0;

// Calculate experience bonus
double experienceBonus = yearsOfExperience * experienceBonusRate;

// Calculate degree bonus based on degree
switch (degree) {
case "bachelor":
degreeBonus = 5000; 
break;
case "master":
degreeBonus = 10000; 
break;
case "phd":
degreeBonus = 15000; 
break;
            
}

// Calculate total salary
double totalSalary = baseSalary + experienceBonus + degreeBonus;

return totalSalary;

}

    
public String toString() {

return super.toString() + "\nDegree: " + degree +"\nyears Of Experience: " + yearsOfExperience +"\nSalary: "+calculateSalary();
    
}

public int getYearsOfExperience() {

return yearsOfExperience;

}
 


public String getDegree() {

return degree;

}


}

