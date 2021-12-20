


package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;


// Java program to demonstrate working of
// State Design Pattern

interface StudenCourseState
{
	public void studentState(MonitorStudentState ctx);
}

class MonitorStudentState
{
	private StudenCourseState currentState;

	public MonitorStudentState()
	{
		currentState = new Reprobate();
	}

	public void setState(StudenCourseState state)
	{
		currentState = state;
	}

	public void studentState()
	{
		currentState.studentState(this);
	}
}

class Reprobate implements StudenCourseState
{
	@Override
	public void studentState(MonitorStudentState ctx)
	{
		System.out.println("Alumno en estado de curso Reprobado");
	}

}

class Approved implements StudenCourseState
{
	@Override
	public void studentState(MonitorStudentState ctx)
	{
		System.out.println("Alumno en estado de curso Aprobado");
	}

}



public class Main
{
	public static void main(String[] args)
	{


		System.out.println(" \n \n Main test -> \n");
		System.out.println(" -------------------------------------------- \n");

		MonitorStudentState stateContext = new MonitorStudentState();
		stateContext.studentState();
		stateContext.studentState();
		stateContext.setState(new Approved());
		stateContext.studentState();
		stateContext.studentState();
		stateContext.studentState();

	}
}
