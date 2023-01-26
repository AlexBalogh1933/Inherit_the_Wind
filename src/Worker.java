public class Worker extends Person
{
    public double hourlyPayRate;
    public double hoursWorked;
    public double fullHoursPay;
    public double overtimeHours;

    public Worker(String firstName, String lastName, String idString, String inputTitle, int yearOfBirth, int year, double hourlyPayRate, double hoursWorked)
    {
        super(firstName, lastName, idString, inputTitle, yearOfBirth, year);
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
    }
    public Worker(String firstName, String lastName, int yearOfBirth, double hourlyPayRate, double hoursWorked)
    {
        super(firstName, lastName, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHoursWorked()
    {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked)
    {
        this.hoursWorked = hoursWorked;
    }

    public double calculateWeeklyPay(double hoursWorked)
    {
        if (hoursWorked <= 40)
        {
           return this.hoursWorked * this.hourlyPayRate;
        }
        else
        {
            double fullHoursPay = this.hourlyPayRate * 40;
            double overtimeHours = this.hoursWorked - 40;
            double overtimePay = overtimeHours * (this.hourlyPayRate * 1.5);
            return fullHoursPay + overtimePay;
        }
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        if(this.hoursWorked <= 40)
        {
            return "You worked " + this.hoursWorked + " and made " + calculateWeeklyPay(this.hoursWorked) ;
        }
        else
        {
            return "You worked 40 hours plus " + this.overtimeHours + " hour of overtime. You made " + calculateWeeklyPay(this.hoursWorked);
        }
    }
}
