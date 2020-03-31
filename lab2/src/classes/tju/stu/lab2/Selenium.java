package classes.tju.stu.lab2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium {
//	public static void main (String[] args) {
	String getInformation(String userID,String pass) {
		String driverPath = System.getProperty("user.dir") + "/src/resources/driver/geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath);
		WebDriver driver = new FirefoxDriver();
    	
        String baseUrl = "http://103.120.226.190/selenium-demo/git-repo";
        driver.get(baseUrl);
        WebElement information ;
        WebElement user;
        WebElement submit;
        WebElement password;

        user = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[1]/input"));
        user.click();
        user.sendKeys(userID);
        password = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[2]/input"));
        password.click();
        password.sendKeys(pass);
        submit = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[3]/input"));
        submit.click();
        information = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div[2]/div/form/div[5]/code"));
//        System.out.println(information.getText());
//        Thread.sleep(10000);
        String infor = information.getText();
        driver.quit();
//        return 1;
        return infor;
	}

}
