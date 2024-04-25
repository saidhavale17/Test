package StepDefination;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	@Given("User is on login page")
	public void given()
	{
		System.out.println("User is on login page");
	}
	
	@When("User clicks on sign up ")
	public void when()
	{
		System.out.println("User clicks on sign up");
	}
	@Then("User should able to see all details")
	public void then()
	{
		System.out.println("User should able to see all details");
	}

	//Reusability
	@Then("user enters firstname {string}")
	public void then1(String temp)
	{
		System.out.println("user enters firstname "+temp);
	}
	//paramertization
	@Then("user enters firstname {string} and lastname {string}")
	public void then1(String temp,String temp1)
	{
		System.out.println("user enters firstname: "+temp+" lastname: "+temp1);
	}
	
	//Regex:user can pass any type of data through (.+)
	@Then ("^User enters mobile number (.+) and email (.+)$")
	public void then2(String number,String email)
	{
		System.out.println("user enters mobno: "+number+" email: "+email);
	}
	
	//Data driven testing
	@When ("User enters")
	public void when1(List<String> temp)
	{
		System.out.println("FirstName: "+temp.get(0));
		System.out.println("LastName: "+temp.get(1));
		System.out.println("Mobno: "+temp.get(2));
		System.out.println("email: "+temp.get(3));
	}
}
