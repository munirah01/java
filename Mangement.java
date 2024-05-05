public class Mangement {


private School [] listEmp ;
int numOfEmp;

public Mangement () {

listEmp = new School [20];
numOfEmp = 0;

}

public boolean addEmp(School e) {

if (numOfEmp < listEmp.length){
if ( e instanceof Managers)
listEmp[numOfEmp++] = new Managers ( e.getName() , e.getId() , ((Managers)e).getYearsOfExperience() );
else
listEmp[numOfEmp++] = new Teachers ( e.getName() , e.getId() , ((Teachers)e).getDegree() , ((Teachers)e).getYearsOfExperience());
return true;
}
else
return false;

}



public Teachers[] allTeachers(){

Teachers [] listT = new Teachers[numOfEmp];
int j = 0;

for (int i = 0 ; i < numOfEmp ; i++)
{
if ( listEmp[i] instanceof Teachers)
listT[j] = new Teachers ( listEmp[i].getName() , listEmp[i].getId() , ((Teachers)(listEmp[i])).getDegree() , ((Teachers)(listEmp[i])).getYearsOfExperience());
j++;
}
if ( j == 0 )
return null;
else
return listT;
}

public Managers[] allManager(){

Managers [] listM = new Managers[numOfEmp];
int j = 0 ;
for (int i = 0 ; i < numOfEmp ; i++)
if ( listEmp[i] instanceof Managers ) 
{
listM[j] = new Managers ( listEmp[i].getName() , listEmp[i].getId() , ((Managers)(listEmp[i])).getYearsOfExperience() );
j++;
}
if ( j == 0 )
return null;
else
return listM;
}


public School findEmployee ( int id ){

for (int i = 0 ; i < numOfEmp ; i++)
if ( listEmp[i].getId()==id )
return listEmp[i];

return null;
}


public double SumTeachersSalary() {

double sum = 0;

for (int i = 0 ; i < numOfEmp ; i++)
if ( listEmp[i] instanceof Teachers)
sum = sum + ((Teachers)(listEmp[i])).calculateSalary();

return sum;

}





}

