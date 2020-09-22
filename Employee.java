public class Employee{
	static final int IS_FULL_TIME=2;
	static final int EMP_RATE_HR=20;
	static final int IS_PART_TIME=1;
	static final int NUM_WORKING_DAYS=20;

	
public static void main(String[] args) {
	
	System.out.println("Welcome to EmployeeWage");

	int employeewage=0;
	int employeehrs=0;
	int totalwage=0;
	for(int day=0;day<NUM_WORKING_DAYS;day++)
{

	int empcheck=(int) Math.floor(Math.random()*10)%3;

	switch(empcheck)
	{
		case 1:
		employeehrs=4;
		break;
		case 2:
		employeehrs=8;
		break;
		default:
		employeehrs=0;
	}


	employeewage=EMP_RATE_HR*employeehrs;
	totalwage=totalwage+employeewage;
	System.out.println("Emp wage for day "+day+" is: "+employeewage);


}

	System.out.println("Total emp wage is: "+totalwage);
}

}
