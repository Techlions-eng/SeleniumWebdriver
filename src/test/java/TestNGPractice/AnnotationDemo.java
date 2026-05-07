package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class AnnotationDemo {


	
	@BeforeMethod
	void login() {
		System.out.println("Login to application....");
	}
	@Test(priority=1)
	void search() {
		String exp_title = "Opencart";
		String act_title="Openshop";
		System.out.println("search....");
		Assert.assertEquals(exp_title,act_title);
	}
	@Test(priority=2)
	void searchAdvance() {
		System.out.println("search advance....");
	}
	@AfterMethod
	void logout() {
		System.out.println("Logout to application....");
	}
}
