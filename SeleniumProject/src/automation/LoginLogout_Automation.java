package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogout_Automation {
    public static void main(String[] args) {
        loginTestCase("Firefox");
    }
    public static void loginTestCase(String browseName) {
        WebDriver oBrowser = null;
        try {
            //1. Open chromwe/edge/firefox browser
            switch(browseName.toLowerCase()) {
                case "chrome":
                    oBrowser = new ChromeDriver();
                    break;
                case "edge":
                    oBrowser = new EdgeDriver();
                    break;
                case "firefox":
                    oBrowser = new FirefoxDriver();
                    break;
                default:
                    System.out.println("The " + browseName + " browser is not supported");
            }
            oBrowser.manage().window().maximize();

            //2. navigate the actiTime URL
            oBrowser.get("");
            Thread.sleep(2000);

            //enter username
            oBrowser.findElement(By.xpath("")).sendKeys("admin");

            //4.enter password
            oBrowser.findElement(By.name("")).sendKeys("manager");

            //5. click on login button
            oBrowser.findElement(By.cssSelector("")).click();
            Thread.sleep(2000);

            if(oBrowser.findElement(By.xpath("")).isDisplayed()) {
                oBrowser.findElement(By.xpath("")).click();
            }

            //6. verify login is successful
            String text = oBrowser.findElement(By.xpath("")).getText();
            if(text.equalsIgnoreCase("Enter time track")) {
                System.out.println("Login to actiTime is successful");
                System.out.println("Failed to login to acatiTime");
                return;
            }

            //7. Logout  from actiTime
            oBrowser.findElement(By.xpath("")).click();
            Thread.sleep(2000);


            //8. verify logout successful
            if(oBrowser.findElement(By.xpath("")).isDisplayed()) {
                System.out.println("Logout from actiTime is successful");
            }else {
                System.out.println("Failed to logout from actiTime");
                return;
            }

            //9. close the browser
            oBrowser.close();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            oBrowser = null;

        }

    }
}
