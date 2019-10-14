package third.controller;

import java.util.ArrayList;
//need to import popup bc its in a different package
import third.view.Popup;

public class Controller
{

	private Popup view;

	public Controller()
	{
		view = new Popup();
	}

	public void start()
	{
		usingLists();
		// loopTest();
	}

	private void usingLists()
	{
		ArrayList<String> userInput = new ArrayList<String>();

		String input = view.askQuestion("Type in some words or done to stop");
		
		while (!input.equalsIgnoreCase("done"))
		{
			userInput.add(input);
			input = view.askQuestion("Keep typing or type done.");
		}
		
		view.displayMessage("Therer are" + userInput.size() + " input tatemetns in the list.");
		
		for (int index =0; index < userInput.size(); index += 1)
		{
			view.displayMessage("Index: " + index + " is storing" + userInput.get(index));	
		}
	}

	private void loopTest()
	{

		// simon says do something and only stop when he says so

		// define the variable
		boolean isFinished = false;
		view.displayMessage("Beans boy");
		int count = 0;

		// test the variable
		while (!isFinished)
		{
			// do things and dont stop here
			System.out.println("Beans and stuff" + count);

			// view.displayMessage(count + "");
			String response = view.askQuestion("Hi, beans?");
			view.displayMessage(response + "?");
			count++;

			if (count > 130)
			{
				// make a stopping point
				isFinished = true;
			}
		}
		System.out.println("Beans and things at: " + count);

		while (count > 0)
		{
			System.out.println(count);
			count--;

		}

		int special = 1;
		do
		{
			System.out.println(special);
			special--;
		} while (special > 0);

		for (int spot = 0; spot < 100; spot++)
		{
			System.out.println("Beans are: " + spot);
		}
		// spot is not visible anymore
	}
}
