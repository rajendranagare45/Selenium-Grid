package Grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities des=new DesiredCapabilities();
		des.setBrowserName("chrome");
		des.setPlatform(Platform.WINDOWS);
		
		ChromeOptions op=new ChromeOptions();
		op.merge(des);
		String HubURl="http://192.168.43.248:4444/wd/hub";
		
		WebDriver driver=new RemoteWebDriver(new URL(HubURl),op);
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		

	}

}
