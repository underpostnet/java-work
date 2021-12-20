


package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;



class Life
{
	private String time;

	public void set(String time)
	{
		System.out.println("Setting time to " + time);
		this.time = time;
	}

	public Memento saveToMemento()
	{
		System.out.println("Saving time to Memento");
		return new Memento(time);
	}

	public void restoreFromMemento(Memento memento)
	{
		time = memento.getSavedTime();
		System.out.println("Time restored from Memento: " + time);
	}

}

class Memento
{
  private final String time;

  public Memento(String timeToSave)
  {
    time = timeToSave;
  }

  public String getSavedTime()
  {
    return time;
  }
}

class Main
{

	public static void main(String[] args)
	{


    System.out.println(" \n \n Main test -> \n");
    System.out.println(" -------------------------------------------- \n");


		List<Memento> savedTimes = new ArrayList<Memento>();

		Life life = new Life();

		//time travel and record the eras
		life.set("1000 B.C.");
		savedTimes.add(life.saveToMemento());
		life.set("1000 A.D.");
		savedTimes.add(life.saveToMemento());
		life.set("2000 A.D.");
		savedTimes.add(life.saveToMemento());
		life.set("4000 A.D.");

		life.restoreFromMemento(savedTimes.get(0));

	}
}
