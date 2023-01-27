public class Worker extends Person
{
    public double hourlyPayRate;
    public double hoursWorked;
    public double overtimeHours = hoursWorked - 40;;

    public Worker(String firstName, String lastName, String idString, String inputTitle, int yearOfBirth, double hourlyPayRate)
    {
        super(firstName, lastName, idString, inputTitle, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
    }

    public String toString()
    {
        return this.getFirstName() + ", " + this.getLastName() + ", " + this.getIdString() + ", " + this.getYearOfBirth() + ", Hourly Pay of " + this.hourlyPayRate;
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }
    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }
    double calculateWeeklyPay(double hoursWorked)
    {
        double overtimePay;

        if (hoursWorked <= 40)
        {
            return hoursWorked * this.hourlyPayRate;
        }
        else
        {
            overtimePay = overtimeHours * (1.5 * this.hourlyPayRate);
            return overtimePay + (40 * this.hourlyPayRate);
        }
    }

    String displayWeeklyPay(double hoursWorked)
    {
        if (hoursWorked <= 40)
        {
            return "Worked for " + hoursWorked + " hours. Paid " + calculateWeeklyPay(hoursWorked);
        }
        else
        {
            return "Worked for 40 hours and " + this.overtimeHours + " overtime hours. Paid " + calculateWeeklyPay(hoursWorked);
        }

    }

}
