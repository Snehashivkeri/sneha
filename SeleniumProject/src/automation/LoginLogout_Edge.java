package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginLogout_Edge {
    public static void main(String[] args) {
        loginTestCase();
    }

    public static void loginTestCase() {
        WebDriver edge = null;
        try {
            // 1. Open Edge browser
            edge = new EdgeDriver();
            edge.manage().window().maximize();

            // 2. Navigate to actiTime URL
            edge.get("http://localhost/login.do");
            Thread.sleep(2000);

            // 3. Enter username
            edge.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");

            // 4. Enter password
            edge.findElement(By.name("pwd")).sendKeys("manager");

            // 5. Click login button
            edge.findElement(By.cssSelector("a[id='loginButton'] div")).click();
            Thread.sleep(2000);

            // 6. Verify login is successful
            String text = edge.findElement(By.xpath("//td[@class='pagetitle']")).getText();
            if(text.equalsIgnoreCase("Enter Time-Track")) {
                System.out.println("Login to ActiTime is successful");
                // 7. Logout from actiTime
                edge.findElement(By.xpath("//a[@id='logoutLink']")).click();
                Thread.sleep(2000);

                // 8. Verify logout successful
                if(edge.findElement(By.xpath("//tbody/tr/td[@id='logoContainer']/div/img")).isDisplayed()) {
                    System.out.println("Logout from actiTime is successful");
                } else {
                    System.out.println("Failed to logout from actiTime");
                }
            } else {
                System.out.println("Failed to login to actiTime");
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            if(edge != null) {
                edge.quit(); // Ensures all browser windows are closed
            }
        }
    }
}

