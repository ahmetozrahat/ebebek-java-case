public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    private double taxAmount = 0;
    private double bonusAmount;
    private double raiseAmount;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
        bonus();
        raiseSalary();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public void tax() {
        if (getSalary() > 1000) {
            this.taxAmount = (getSalary() * 3) / 100;
        }
    }

    public void bonus() {
        if (getWorkHours() > 40) {
            this.bonusAmount = ((getWorkHours() - 40) * 30);
            setSalary(getSalary() + this.bonusAmount);
        }
    }

    public void raiseSalary() {

        int currentYear = 2021;
        int yearOfExprerience = currentYear - getHireYear();

        if (yearOfExprerience > 19) {
            this.raiseAmount = (getSalary() * 15) / 100;
            setSalary(getSalary() + this.raiseAmount);
        } else if (yearOfExprerience > 9 && yearOfExprerience < 20) {
            this.raiseAmount = (getSalary() * 10) / 100;
            setSalary(getSalary() + this.raiseAmount);
        } else if (yearOfExprerience < 10) {
            this.raiseAmount = (getSalary() * 5) / 100;
            setSalary(getSalary() + this.raiseAmount);
        }
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Salary: " + getSalary()+ "(Bonus: "+this.bonusAmount+",Raise: " +this.raiseAmount + " Work Hours: " + getWorkHours() + " Hire Year: " + getHireYear();
    }
}
