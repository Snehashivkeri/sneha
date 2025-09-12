package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxis4 {
    public static void main(String[] args) {
        ancestors();
    }
    public static void ancestors() {
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/SampleWebTables.html");


            //   following-sibling: It travels in forward direction within one row OR within next level.
            String id = chrome.findElement(By.xpath("//input[@id='frm1_un_id']/ancestor::form")).getDomAttribute("id");
            System.out.println(id);
            Thread.sleep(2000);


        }catch(Exception e){
            e.printStackTrace();
        }
        finally{
            chrome = null;
        }
    }
}
