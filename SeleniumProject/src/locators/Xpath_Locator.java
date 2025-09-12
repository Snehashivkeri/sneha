package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Locator {
    public static void main(String[] args) {
        xpathLocator();
    }
    public static void xpathLocator(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file://C:\\Users\\Dell\\Downloads\\Sample Web Project.html");

            //using xpath enter userName and password
            chrome.findElement(By.xpath("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html")).sendKeys("aaaaaaaaaaaaa");
            Thread.sleep(2000);

            chrome.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
