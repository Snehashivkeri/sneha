package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis6 {
    public static void main(String[] args) {
        parent();
    }
    public static void parent() {
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file://C:\\Users\\Dell\\Downloads\\Sample Web Project.html");


            //   following-sibling: It travels in forward direction within one row OR within next level.
              chrome.findElement(By.xpath("//input[@id='frm1_un_id']/parent::form")).sendKeys("aaaaaaaa");

            Thread.sleep(2000);


        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}

