package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Partial_locators {
    public static void main(String[] args) {
        Startswith();
    }
    public static void Startswith() {
        ChromeDriver chrome = null;
        try{
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html");


          //  Q: If the first username attributes are chaning (ex id attribute values) at the end of the attribute values. Then use stars-with():
            chrome.findElement(By.xpath("//input[starts-with(@id, 'frm1_un_i')]")).sendKeys("aaaaaaaaaaaaa");
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

