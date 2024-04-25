package StepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void before()
	{
		System.out.println("It will be run before all scenarios in all feature files which are mentioned under feature package mentioned in runner class");
		
	}

	@Before("@smoke")
	public void before1()
	{
		System.out.println("It will be run before scenarios having tag chrome in all feature files which are mentioned under feature package mentioned in runner class");
		
	}
	@After
	public void after()
	{
		System.out.println("It will be run after all scenarios in all feature files which are mentioned under feature package mentioned in runner class");
		
	}

	@After("@chrome")
	public void after1()
	{
		System.out.println("It will be run after scenarios having tag chrome in all feature files which are mentioned under feature package mentioned in runner class");
		
	}
}
