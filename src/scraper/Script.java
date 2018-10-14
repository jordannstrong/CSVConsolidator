package scraper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.support.ui.Select;

public class Script {
	public Script() {
		
	}
	
	public void scripter() {
		WebDriver driver = new HtmlUnitDriver();
		
		driver.get("http://scripter/admin/UploadInputSets.aspx");
		
		WebElement uploadFile = driver.findElement(By.name("fileInput"));
		WebElement uploadSubmit = driver.findElement(By.name("btnSubmit"));
		
		uploadFile.sendKeys("Q:\\Gamestop\\XCP\\output.xls");
		uploadSubmit.click();
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.get("http://scripter/admin/AssignInputSets.aspx");
		
		Select dropdown = new Select(driver.findElement(By.name("ddlProjectNames")));
		dropdown.selectByVisibleText("[Unassigned]");
		
		dropdown = new Select(driver.findElement(By.name("ddlColumnNames")));
		dropdown.selectByVisibleText("Order Number");
		
		dropdown = new Select(driver.findElement(By.name("ddlDisplay1")));
		dropdown.selectByVisibleText("SiteID");
		
		dropdown = new Select(driver.findElement(By.name("ddlDisplay2")));
		dropdown.selectByVisibleText("ThisLAN");
		
		dropdown = new Select(driver.findElement(By.name("ddlDisplay3")));
		dropdown.selectByVisibleText("Primary");
		
		dropdown = new Select(driver.findElement(By.name("ddlDisplay4")));
		dropdown.selectByVisibleText("WanBK");
		
		//Add in submit filter button here
		
		try {
			Thread.sleep(500000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.findElement(By.name("inp))(By.id("idOfTheElement")).click();
	}
}
