package jsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import javascriptutils.JavaScriptUtils;

public class JsDemo extends JavaScriptUtils {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("/html/body/div/header/div/ul/li[2]/a"));

		// flash(element, driver);
		drawBorder(element, driver);
		String titleByJs = getTitleByJs(driver);
		System.out.println(titleByJs);

		// WebElement login =
		// driver.findElement(By.xpath("/html/body/div/header/div/ul/li[1]/a/span"));
		// clickElementByJs(login, driver);

		// generateAlert(driver, "you clicked on login button.");

		WebElement img = driver.findElement(By.xpath("//*[@id=\"rslides3_s0\"]/div[1]/img"));

		// scrollIntoView(img, driver);

		scrollPageDown(driver);

	}
}
