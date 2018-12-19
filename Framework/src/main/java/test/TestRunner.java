package test;

import org.testng.annotations.Test;

import implementation.LogInPageImplementation;

public class TestRunner {

	@Test
	public void testRun()
	{
		LogInPageImplementation login=new LogInPageImplementation();
		login.pageImpl( "1","Sheet1");
	}
}

	

