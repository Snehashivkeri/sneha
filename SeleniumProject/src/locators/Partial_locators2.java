package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_locators2 {
    public static void main(String[] args) {
        containswith();
    }
    public static void containswith() {
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html");


            //If the first username attributes are chaning (ex id attribute values) at the beginning/middle/end of the attribute values. Then use contains():
            chrome.findElement(By.xpath("//input[contains(@id, 'm1_un_id')]")).sendKeys("aaaaaaaaaaaaa");
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

