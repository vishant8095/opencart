package testCase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class base_class {

	static public WebDriver driver;
	public Logger logger;
	public Properties p;
	
	
	@BeforeMethod
	@Parameters("Browser")
	void setup(String br) throws IOException
	{
		FileReader file=new FileReader(".\\src\\test\\resources\\config.properties");
		p=new Properties();
		p.load(file);
		logger=LogManager.getLogger(this.getClass());
		switch(br.toLowerCase())
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		default:System.out.println("Invalide browser");return;
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(p.getProperty("appURL"));
	}
	@AfterMethod
	void teardown()
	{
		driver.quit();
	}
	
	public String random_string()
	{
		String genrtedstring=RandomStringUtils.randomAlphabetic(5);
		return genrtedstring;
	}
	public String random_number()
	{
		String genratednumber=RandomStringUtils.randomNumeric(5);
		return genratednumber;
	}
	public String random_Alphanumeric()
	{
		String str=RandomStringUtils.randomAlphabetic(3);
		String num=RandomStringUtils.randomNumeric(2);
       return (str+"@"+num);
	}
	
	public String captureScreen(String tname) throws IOException {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
				
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath=System.getProperty("user.dir")+"\\screenshots\\" + tname + "_" + timeStamp + ".png";
		File targetFile=new File(targetFilePath);
		
		sourceFile.renameTo(targetFile);
			
		return targetFilePath;

	}
	
}
