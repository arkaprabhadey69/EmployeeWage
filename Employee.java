public class Employee{
	static final int IS_FULL_TIME=2;
	static final int EMP_RATE_HR=20;
	static final int IS_PART_TIME=1;

	
public static void main(String[] args) {
	
	
	System.out.println("Welcome to EmployeeWage");

	int employeewage=0;
	int employeehrs=0;

	double empcheck= Math.floor(Math.random()*10)%3;

	if(empcheck==IS_FULL_TIME)
	{
		employeehrs=8;
	}
	else if(empcheck==IS_PART_TIME)
	{
		employeehrs=4;
	}
	else
		employeehrs=0;
	employeewage=EMP_RATE_HR*employeehrs;

	System.out.println("Emp wage is: "+employeewage);
}

}
