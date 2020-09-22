public class Employee{
	static final int IS_FULL_TIME=2;
	static final int EMP_RATE_HR=20;
	static final int IS_PART_TIME=1;
	static final int NUM_WORKING_DAYS=20;
	static final int NUM_WORKING_HRS=100;

	
public static void main(String[] args) {
	
	System.out.println("Welcome to EmployeeWage");
	int employeehrs=0;
	int totalworkdays=0;
	int totalemphrs=0;
	int totalwage=0;
	
	while(totalemphrs<=NUM_WORKING_HRS&&totalworkdays<NUM_WORKING_DAYS)
{
	totalworkdays++;
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


	
	totalemphrs+=employeehrs;
	System.out.println("Emp hrs for day "+totalworkdays+" is: "+totalemphrs);


}
	totalwage=totalemphrs*EMP_RATE_HR;

	System.out.println("Total emp wage is: "+totalwage);
}

}
