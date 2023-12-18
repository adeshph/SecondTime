package Practice111;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumStart {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();

        // open the browser and navigate to a URL
        driver.get("https://www.google.com");
        
        String a=driver.getTitle();
        
        System.out.println(a);
        
        driver.close();
        
	}

}
