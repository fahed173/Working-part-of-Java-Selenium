package qaAuto;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstpro {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\driver chrom\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1:5500/index.html");
		String myTittle = driver.getTitle();
		System.out.println(myTittle);
		 List <WebElement>  myList = driver.findElements(By.tagName("option"));
		 for(int i = 0 ; i<myList.size();i++) {
			 
			 System.out.println(myList.get(i).getText());
			 
			 
			 
			 
			 
			 
		 }
		
		
	}

}
