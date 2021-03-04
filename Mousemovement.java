package pacakage2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//import com.sun.org.apache.bcel.internal.generic.Select;
//spicejet.com
public class Mousemovement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']"))).build().perform();//Addons
		//Thread.sleep(3000);
		action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'SpiceMAX')]"))).build().perform();
		Thread.sleep(3000);
 WebElement w= driver.findElement(By.xpath("//input[@type=\"radio\" and @value=\"RoundTrip\"]"));
 w.click();
Thread.sleep(3000);
By currency=By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']");//dropdown box xpath
Select select1= new Select(driver.findElement(currency));
select1.selectByIndex(0);
//By from=By.id("//select[@id='ctl00_mainContent_ddl_originStation1']");
//Select select2= new Select(driver.findElement(from));
//select2.selectByIndex(1);//Doubt//
	}

}
