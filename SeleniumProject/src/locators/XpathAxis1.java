package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis1 {
    public static void main(String[] args) {
        following();
    }
    public static void following() {
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/SampleWebTables.html");


            //following: It travels in forward direction within one row or many rows OR multiple levels.
           // The following can acts as following-sibling & following.

                    String text = chrome.findElement(By.xpath("//input[@id='frm1_un_id']/following::input[1]")).getText();
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

