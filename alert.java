package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class alert {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(op);
driver.get("https://www.leafground.com/alert.xhtml");
WebElement simplebox=driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt91\']/span[2]"));
simplebox.click();
Alert alert=driver.switchTo().alert();
alert.accept();


	}

}
