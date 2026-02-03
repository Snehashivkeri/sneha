package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

  public class UploadResumeNaukri {

    public static void main(String[] args) {
        uploadResumeInNaukri();
    }

    public static void uploadResumeInNaukri() {
        WebDriver oBrowser = null;
        Actions oAction = null;

        try {
            // 1. Set path to ChromeDriver
            //System.setProperty("webdriver.chrome.driver", "C:\\path\\to\\chromedriver.exe");

            // 2. Open Chrome browser
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();
            oBrowser.navigate().to("https://www.naukri.com/");
            Thread.sleep(2000);

            // 3. Click on "Register" link
            oBrowser.findElement(By.id("register_Layer")).click();
            Thread.sleep(2000);

            // 4. Enter user details
            oBrowser.findElement(By.id("name")).sendKeys("sgTesting");
            oBrowser.findElement(By.id("email")).sendKeys("sgTesting1@sg.com");
            oBrowser.findElement(By.id("password")).sendKeys("Admin@123");
            oBrowser.findElement(By.id("mobile")).sendKeys("9988556622");

            // 5. Select work status
            oBrowser.findElement(By.xpath("//p[contains(text(),'work experience')]")).click();
            Thread.sleep(1000);

            // 6. Scroll or move to Upload Resume button
            oAction = new Actions(oBrowser);
            oAction.moveToElement(oBrowser.findElement(By.xpath("//button[text()='Register now']"))).perform();
            Thread.sleep(2000);

            // 7. Click on Upload Resume button
            oBrowser.findElement(By.xpath("//button[text()='Upload Resume']")).click();
            Thread.sleep(4000);

            // 8. Handle Upload window with AutoIT
            Runtime.getRuntime().exec("C:\\Users\\Dell\\Downloads\\UploadCV.exe");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (oBrowser != null) {
                oBrowser.quit();
            }
        }
    }
}
