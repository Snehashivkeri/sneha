package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RXpath_text1 {
    public static void main(String[] args) {
        RXpath_text1();
    }
    public static void RXpath_text1(){
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file://C:\\Users\\Dell\\Downloads\\Sample Web Project.html");

            //using xpath enter userName and password
           String text =  chrome.findElement(By.xpath("//p[text()='Sample paragraphs One']")).getText();
           System.out.println(text);
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

