package com.vilas;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//My name is vilas
public class TestGit {
public WebDriver driver;
	
	@Test
	public void vilastutorials() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(45,
				TimeUnit.SECONDS);
		String title = "Meet Guru99";
		String altTitle = driver.getTitle();
		if(altTitle.contains(title)){
			System.out.println("Test case is passed");
		}else {
			System.out.println("Test case is passed");
		}
		driver.close();
		
	}

}
