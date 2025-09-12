package handleframes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Objects;

public class HandleFrameCase {
    public static void main(String[] args) {
        handleFrameTestCase1();
    }
    public static void handleFrameTestCase1() {
        WebDriver oBrowser = null;
        try {
            //1. open the sample independent frame application
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();
            oBrowser.navigate().to("file:///C:/Users/Dell/Documents/Independent_frame/Main%20page.html");
            Thread.sleep(2000);

            //2. read the main page header
            System.out.println(oBrowser.findElement(By.tagName("h1")).getText());

            //3. using index switch to Page1 from and select all the checkboxes
            oBrowser.switchTo().frame(0);

            List<WebElement> chkBoxes = oBrowser.findElements(By.xpath("//input[@type='checkbox']"));
            for(int i=0; i<chkBoxes.size(); i++) {
                chkBoxes.get(i).click();
            }
            Thread.sleep(2000);

            //4. go back to main page
            oBrowser.switchTo().defaultContent();

            //5. using name/id attribute switch to page 2 frame

            //6. Enter username and password
            oBrowser.switchTo().frame("page2");
            oBrowser.findElement(By.xpath("//input[@id='frm1_un_id']")).sendKeys("sgadmin");
            oBrowser.findElement(By.xpath("//input[@id='frm1_pwd_id']")).sendKeys("sgadmin");
            Thread.sleep(2000);

            //7. go back to main page.
            oBrowser.switchTo().defaultContent();

            //8. using WebElement switch to page1 frame & uncheck all the checkboxes
            WebElement oFrame = oBrowser.findElement(By.xpath("//iframe[@name='page1']"));
            oBrowser.switchTo().frame(oFrame);
            chkBoxes=oBrowser.findElements(By.xpath("//input[@type='checkbox']"));
            for(int i=0; i<chkBoxes.size(); i++) {
                chkBoxes.get(i).click();
            }
            Thread.sleep(2000);

            //9. go back to main page
            oBrowser.switchTo().defaultContent();

            //10. close the main  page
            oBrowser.close();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            oBrowser = null;
        }
    }

}
