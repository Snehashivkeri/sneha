package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassName {
public static void main(String[] args) {
    classNamelocator();
}

public static void classNamelocator() {
    ChromeDriver chrome = null;
    try {
        chrome = new ChromeDriver();
        chrome.manage().window().maximize();

        //chrome.get("file:///E:/MorningBatch_Combined/HTML/Webpage/SampleWebPage.html");
        chrome.navigate().to("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html");

        //using id enter userName and password
        chrome.findElement(By.className("frm1_un_class")).sendKeys("aaaaaaaaaaaaa");
        chrome.findElement(By.className("frm1_pwd_class")).sendKeys("bbbbbbbbbbb");
        Thread.sleep(2000);

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        chrome = null;
    }
}
}
