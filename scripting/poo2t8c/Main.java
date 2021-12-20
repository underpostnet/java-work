


package Main;

import Main.*;

import java.util.*;
import java.util.ArrayList;


// Java program to demonstrate working of
// State Design Pattern

interface MobileAlertState
{
	public void alert(AlertStateContext ctx);
}

class AlertStateContext
{
	private MobileAlertState currentState;

	public AlertStateContext()
	{
		currentState = new Vibration();
	}

	public void setState(MobileAlertState state)
	{
		currentState = state;
	}

	public void alert()
	{
		currentState.alert(this);
	}
}

class Vibration implements MobileAlertState
{
	@Override
	public void alert(AlertStateContext ctx)
	{
		System.out.println("vibration...");
	}

}

class Silent implements MobileAlertState
{
	@Override
	public void alert(AlertStateContext ctx)
	{
		System.out.println("silent...");
	}

}



public class Main
{
	public static void main(String[] args)
	{


		System.out.println(" \n \n Main test -> \n");
		System.out.println(" -------------------------------------------- \n");

		AlertStateContext stateContext = new AlertStateContext();
		stateContext.alert();
		stateContext.alert();
		stateContext.setState(new Silent());
		stateContext.alert();
		stateContext.alert();
		stateContext.alert();		

	}
}
