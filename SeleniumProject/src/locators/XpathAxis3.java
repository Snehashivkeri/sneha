package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis3 {
    public static void main(String[] args) {
        preceding();
    }
    public static void preceding() {
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/SampleWebTables.html");


           // preceding-sibling: It travels in a backward direction within one row OR one level.

            String text = chrome.findElement(By.xpath("//td[text()='Narendra Modi']/preceding::tr[1]/td[1]")).getText();
            Thread.sleep(2000);


        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}

