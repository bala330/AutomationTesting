package org.in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleScript {

	public static void main(String[] args) {
		// It will setup for drivers
		WebDriverManager.chromedriver().setup();
		//We will create a webDriver instances
		WebDriver driver=new ChromeDriver();
		//It will maximize the windows
		driver.manage().window().maximize();
		//It will using the string URL
		driver.get("https://www.demoblaze.com/");
		//It will the get the title of that page
		String title=driver.getTitle();
		System.out.println("Get the page title : " + title);
		//It will add webElements for operations of the many webElements
		WebElement button= driver.findElement(By.id("cartur"));
		button.click();
		//It will get current URL of that page
		String url=driver.getCurrentUrl();
		System.out.println("Get the current page url : "+ url);
		
		
		//It will close the browser
		driver.close();
		
		
		

	}

}
