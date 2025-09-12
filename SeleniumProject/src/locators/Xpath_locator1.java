package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_locator1 {
public static void main(String[] args) {
    Xpath_locator1();
}

public static void Xpath_locator1(){
    ChromeDriver chrome = null;
    try{
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
        chrome.navigate().to("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html");

        //using xpath enter userName and pas
        // sword
        chrome.findElement(By.xpath("/html/body/form[@id='frm1']/input[@id='frm1_pwd_id']")).sendKeys("aaaaaaaaaaaaa");
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

