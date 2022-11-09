package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot {
	
	public static void clickScreenshot(WebDriver driver, String SnapName) throws IOException {
		
		LocalDateTime datewithtime = LocalDateTime.now();
		DateTimeFormatter mypattern = DateTimeFormatter.ofPattern("DD-MM-YY HH_MM_SS");
		String timestemp = datewithtime.format(mypattern);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("D:\\eclipse\\SwagLaps\\Fail_TestCase\\"+SnapName+"-"+timestemp+".png");
		FileHandler.copy(source, destination);
		
	}

}
