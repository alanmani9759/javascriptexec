package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesVal {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		WebElement iframe = driver.findElement(By.xpath("//div[@id='iframewrapper']//iframe"));
		driver.switchTo().frame(iframe);

		WebElement findElement = driver.findElement(By.tagName("iframe"));
		if (findElement != null) {
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//form[@class='example']//input")).sendKeys("amigo");
			driver.findElement(By.xpath("//form[@class='example']//button")).click();
		} else {
			System.out.println("frame not present");
		}

	}
}
