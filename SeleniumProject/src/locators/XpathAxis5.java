package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis5 {
    public static void main(String[] args) {
        descendents();
    }
    public static void descendents() {
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/SampleWebTables.html");


            //   following-sibling: It travels in forward direction within one row OR within next level.

            String text = chrome.findElement(By.xpath("//body/descendant::td[text()='Abdul Kalam']")).getText();
            System.out.println(text);
            Thread.sleep(2000);



        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}

