public class Managers extends School {


private int yearsOfExperience;

public Managers(String name, int id, int yearsOfExperience) {
   
super ( name , id );
this.yearsOfExperience = yearsOfExperience;

}

public double calculateSalary() {

double baseSalary = 40000; 
double experienceBonusRate = 1500;

// Calculate experience bonus
double experienceBonus = yearsOfExperience * experienceBonusRate;

// Calculate total salary
double totalSalary = baseSalary + experienceBonus;

return totalSalary;

}

public String toString() {

return super.toString() + "\nYears of Experience: " + yearsOfExperience +"\nSalary: "+calculateSalary();

}

// Getters and setters
    
public int getYearsOfExperience() {
 
return yearsOfExperience;

}


}
