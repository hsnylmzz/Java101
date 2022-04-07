
public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    
    Employee(String name,int salary,int workHours,int hireYear)
    {
    	this.name = name;
    	this.salary = salary;
    	this.workHours = workHours;
    	this.hireYear = hireYear;
    }
    
    double tax()
    {
    	if(salary < 1000)
    	{
    		return 0;
    	}
    	else
    	{
    		return salary * 0.3;
    	}
    }
    double bonus()
    {
    	int sum,total = 0;
    	if(workHours > 40)
    	{
    		for (int i = 41; i <= this.workHours; i++) {
                sum = i % 10;
                total = sum;
            }
    	}
    	return total * 30;
    }
    double raiseSalary()
    {
    	double tempSalary = this.salary;
        int totalYear = 2021 - this.hireYear;
        if (totalYear < 10) {
            return tempSalary * 0.05;
        } else if (totalYear < 20) {
            return tempSalary * 0.10;
        } else {
            return tempSalary * 0.15;
        }
    }
    
    public String toString() {
        return  "Name: " + this.name + "\n" +
                "Salary: " + this.salary + "\n" +
                "Work Hours: " + this.workHours + "\n" +
                "Hire Year: " + this.hireYear + "\n" +
                "Tax: " + tax() + "\n" +
                "Bonus: " + bonus() + "\n" +
                "Salary increase: " + raiseSalary() + "\n" +
                "Salary with tax and bonus: " + (this.salary - tax() + bonus()) + "\n" +
                "Total Salary: " + (this.salary + raiseSalary() - tax() + bonus());
    }
}
