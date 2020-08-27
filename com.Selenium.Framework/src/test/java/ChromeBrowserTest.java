import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeBrowserTest {

	@Test
	public void chromeBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Phtotype\\Update project code\\com.Phototye.MyColors\\Resources\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println("Given URL launched");
		Thread.sleep(3000);
		driver.close();
		driver.quit();
	}
}
