package handleAlerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static handleAlerts.DynamicAlerts.isAlertPresent;

public class dynamic_alerts {
    public static void main(String[] args) {
          handledynamicalerts();
    }
  public static void handledynamicalerts() {
    WebDriver oBrowser = null;
    try {

        oBrowser = new ChromeDriver();
        oBrowser.manage().window().maximize();

        oBrowser.navigate().to("file:///C:/Users/Dell/Documents/javaSelenium.html");
        Thread.sleep(2000);

        //click the alert button
        oBrowser.findElement(By.xpath("//input[@id='btn_id1']"));

        if (isAlertPresent(oBrowser) == true) {
            Thread.sleep(2000);

            Alert oAlert = oBrowser.switchTo().alert();
            System.out.println(oAlert.getText());
            oAlert.accept();
        } else {
            System.out.println("No alert is present in this time");

        }
        Thread.sleep(2000);
        oBrowser.close();
}catch(Exception e){
        e.

printStackTrace();
    }finally {
    oBrowser = null;
        }
        }


        public static boolean isAlertPresent(WebDriver oBrowser) {
    try {
        oBrowser.switchTo().alert();
        return true;
    }catch(NoAlertPresentException e) {
        return false;
    }
        }
        }

