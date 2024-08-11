package thirdProjectAuto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyTestcases {

	WebDriver driver = new ChromeDriver();

	@BeforeTest
	public void mysetUp() {
		driver.get("http://127.0.0.1:5500/index.html");
		driver.manage().window().maximize();

	}

	@Test
	public void myTest() {
		// driver.findElement(By.className("commonInput")).sendKeys("+$12345"); this
		// will return only first element and always return data from top-left
		// driver.findElement(By.className("commonInput")).sendKeys("012345");

		WebElement userNameInput = driver.findElement(By.id("input1"));
		WebElement passWordInput = driver.findElement(By.id("input2"));
		WebElement phoneNumInput = driver.findElement(By.id("input3"));
		WebElement birthDateInput = driver.findElement(By.id("input4"));

		userNameInput.sendKeys("Asil");
		passWordInput.sendKeys("12345");
		phoneNumInput.sendKeys("075855554");
		birthDateInput.sendKeys("09/24/1995");

		WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
		submitButton.click();

		// WebElement facebookpage=
		// driver.findElement(By.xpath("//a[@href='https://www.facebook.com']"));
		// facebookpage.click();

		// WebElement facebookpage=driver.findElement(By.linkText("our facebook page"));
		// facebookpage.click();

		// WebElement instagrampage=driver.findElement(By.partialLinkText("instagram"));
		// instagrampage.click();

		WebElement img = driver.findElement(By.xpath(
				"//img[@src='https://static.vecteezy.com/system/resources/thumbnails/018/930/698/small_2x/facebook-logo-facebook-icon-transparent-free-png.png']"));
		img.click();

	}

}
