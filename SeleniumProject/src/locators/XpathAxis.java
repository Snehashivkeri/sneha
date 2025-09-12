package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis {
    public static void main(String[] args) {
        followingsibling();
    }
    public static void followingsibling() {
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/SampleWebTables.html");


         //   following-sibling: It travels in forward direction within one row OR within next level.
                 String text = chrome.findElement(By.xpath("//td[text()='Abdul Kalam']/following-sibling::td[1]")).getText();
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

