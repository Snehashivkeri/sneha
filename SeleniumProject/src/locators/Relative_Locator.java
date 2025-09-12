package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Relative_Locator {
    public static void main(String[] args) {
        Relative_locator();
    }
    public static void Relative_locator() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

            // chrome.navigate().to("file:///C:/Users/Dell/Downloads/SampleWebTables.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html");



         //   chrome.findElement(RelativeLocator.
                  //  with(By.tagName("input"))
                  //  .toRightOf(By.xpath("//input[@id='frm1_un_id']"))).sendKeys("aaaaaaaaa");
              //  Thread.sleep(2000);

           // chrome.findElement(RelativeLocator.
                  //  with(By.tagName("input"))
                 //   .toRightOf(By.xpath("//input[@id='frm1_un_id']"))).sendKeys("aaaaaaaaa");
          //  Thread.sleep(2000);

         //   chrome.findElement(RelativeLocator.
           //         with(By.tagName("input")).
             //       above(By.xpath("//input[@id='frm1_ok_id']"))).sendKeys("aaaaaaaaa");

         // chrome.findElement(RelativeLocator.
           //               with(By.xpath("//input[1]")).
             //            below(By.xpath("//pre/b[contains(text(),'Four')]"))).sendKeys("aaaaaaaaa");


          chrome.findElement(RelativeLocator.
                  with(By.xpath("//input[1]")).
                   near(By.xpath("//pre/b[contains(text(),'Four')]"))).sendKeys("aaaaaaaaa");



        }catch(Exception e) {
            e.printStackTrace();
            chrome = null;

        }
    }
}



