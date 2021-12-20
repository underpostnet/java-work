


package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;

// Java program to illustrate Null
// Object Design Pattern

abstract class Emp
{
	protected String name;
	protected String rut;
	public abstract boolean isNull();
	public abstract String getName();
	public abstract String getRut();
}

class Coder extends Emp
{
	public Coder(String name, String rut)
	{
		this.name = name;
		this.rut = rut;
	}
	@Override
	public String getName()
	{
		return name;
	}
	@Override
	public String getRut()
	{
		return rut;
	}
	@Override
	public boolean isNull()
	{
		return false;
	}
}

class NoStudent extends Emp
{
	@Override
	public String getName()
	{
		return "No Disponible";
	}
	@Override
	public String getRut()
	{
		return "No Disponible";
	}

	@Override
	public boolean isNull()
	{
		return true;
	}
}

class EmpData
{

	public static final String[] names = {"Jose", "Catalina", "Pablo"};
	public static final String[] ruts = {"17459354-5", "15452364-5", "18419370-5"};
	public static Emp getStudent(String name)
	{
		for (int i = 0; i < names.length; i++)
		{
			if (names[i].equalsIgnoreCase(name))
			{
				return new Coder(name, ruts[i]);
			}
		}
		return new NoStudent();
	}
}

public class Main
{
	public static void main(String[] args)
	{


		System.out.println(" \n \n Main test -> \n");
		System.out.println(" -------------------------------------------- \n");

		Emp emp1 = EmpData.getStudent("Jose");
		Emp emp2 = EmpData.getStudent("Catalina");
		Emp emp3 = EmpData.getStudent("Pablo");
		Emp emp4 = EmpData.getStudent("Matias");


		System.out.println(emp1.getName());
		System.out.println(emp1.getRut());
		System.out.println(" \n");
		System.out.println(emp2.getName());
		System.out.println(emp2.getRut());
		System.out.println(" \n");
		System.out.println(emp3.getName());
		System.out.println(emp3.getRut());
		System.out.println(" \n");
		System.out.println(emp4.getName());
		System.out.println(emp4.getRut());
		System.out.println(" \n");
	}
}
