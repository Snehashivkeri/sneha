package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class interfacesFrameTestCase {
    public static void main(String[] args) {
        interfaceFrameTestCase();
    }
    public static void interfaceFrameTestCase() {
        WebDriver oBrowser = null;
        try {
            //1. open the "https"//docs.oracle.com/javase/8/docs/api/" application
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();
            oBrowser.navigate().to("https://docs.oracle.com/javase/8/docs/api/");
            Thread.sleep(2000);

            //2. Read the main page title and URL.
            System.out.println("page Title"+oBrowser.getTitle());

            //3. using index switch to 'packages' frame and click on the "java.awt" link
            oBrowser.switchTo().frame(0);
            oBrowser.findElement(By.xpath("//a[@href='java/awt/package-frame.html']")).click();
            Thread.sleep(2000);

            //4. go back to main page
            oBrowser.switchTo().defaultContent();

            //5. using name/id attribute switch to 'interfaces' frame
            oBrowser.switchTo().frame("packageFrame");
            Thread.sleep(2000);

            //6. click on the "ActiveEvent" link
            oBrowser.findElement(By.xpath("//a[@href='ActiveEvent.html']")).click();

            //7. go back to main page
            oBrowser.switchTo().defaultContent();

            //8. using WebElement switch to 'interface ActiveEvent' frame
            oBrowser.switchTo().frame("classFrame");


            //9. Read the page header "interfae ActiveEvent"
            String text = oBrowser.findElement(By.xpath("//h2[@class='title']")).getText();
            System.out.println(text);

            //10. go back to main page
            oBrowser.switchTo().defaultContent();

            //11. close the main page
            oBrowser.close();
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            oBrowser = null;
        }

    }
}
