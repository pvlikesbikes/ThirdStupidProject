package third.controller;

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
		loopTest();
	}
	
	private void loopTest()
	{
		
		//simon says do something and only stop when he says so
		
		//define the variable
		boolean isFinished = false;
		view.displayMessage("Beans boy");
		int count = 0;
		
		//test the variable
		while (!isFinished)
		{
			//do things and dont stop here
			System.out.println("Beans and stuff" + count);
			
			//view.displayMessage(count + "");
			String response = view.askQuestion("Hi, beans?");
			view.displayMessage(response + "?");
			count ++;
					
			if (count > 130)
			{
				//make a stopping point
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
		}while (special > 0);
		
		for (int spot = 0; spot < 100; spot++)
		{
			System.out.println("Beans are: " + spot);
		}
		//spot is not visible anymore
	}
}
