


package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;



class Student
{
	private String course;

	public void set(String course)
	{
		System.out.println("Setting course to " + course);
		this.course = course;
	}

	public Memento saveToMemento()
	{
		System.out.println("Saving course to Memento");
		return new Memento(course);
	}

	public void restoreFromMemento(Memento memento)
	{
		course = memento.getSavedCourse();
		System.out.println("Course restored from Memento: " + course);
	}

}

class Memento
{
  private final String course;

  public Memento(String courseToSave)
  {
    course = courseToSave;
  }

  public String getSavedCourse()
  {
    return course;
  }
}

class Main
{

	public static void main(String[] args)
	{


    System.out.println(" \n \n Main test -> \n");
    System.out.println(" -------------------------------------------- \n");


		List<Memento> savedCourses = new ArrayList<Memento>();

		Student student = new Student();

		//course travel and record the eras
		student.set("1ro Basico");
		savedCourses.add(student.saveToMemento());
		student.set("2do Basico");
		savedCourses.add(student.saveToMemento());
		student.set("3ro Basico.");
		savedCourses.add(student.saveToMemento());
		student.set("4to Basico.");

		student.restoreFromMemento(savedCourses.get(1));

	}
}
