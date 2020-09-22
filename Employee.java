public class Employee{
	
public static void main(String[] args) {

	System.out.println("Welcome to EmployeeWage");
	
	int IS_FULL_TIME=1;
	int EMP_RATE_HR=20;

	int employeewage=0;
	int employeehrs=0;

	double empcheck= Math.floor(Math.random()*10)%2;

	if(empcheck==IS_FULL_TIME)
	{
		employeehrs=8;
	}
	
	employeewage=EMP_RATE_HR*employeehrs;

	System.out.println("Emp wage is: "+employeewage);
}

}
