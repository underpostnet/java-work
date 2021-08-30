

public class Empleado
{
  
    private int salary;
    private String name;
    private String company;

    public Empleado(
        int salary, 
        String name, 
        String company )
    {
        this.salary = salary;
        this.name = name;
        this.company = company;
    }

    public int getSalary()
    {
        return salary;
    }
}
