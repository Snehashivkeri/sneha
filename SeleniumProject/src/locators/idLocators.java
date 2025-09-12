package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class idLocators {
    public static void main(String[] args) {
        namelocator();
    }

    public static void namelocator() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();
            //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html");


            //using name enter userName and password
            chrome.findElement(By.name("frm1_un_name")).sendKeys("aaaaaaaaaaaaa");
            chrome.findElement(By.name("frm1_pwd_name")).sendKeys("bbbbbbbbbbb");
            Thread.sleep(2000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            chrome = null;
        }
    }
}