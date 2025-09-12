package fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demoqa {
    public static void main(String[] args) {
        demo_qa();
    }
    public static void demo_qa() {
        WebDriver oBrowser = null;
        Actions oAction = null;
        try {
            //1. open browser and navigate to https://demoqa.com/upload-download
            oBrowser = new ChromeDriver();
            oBrowser.manage().window().maximize();
            oBrowser.navigate().to("https://demoqa.com/upload-download");
            Thread.sleep(2000);

            oAction = new Actions(oBrowser);
            oAction.moveToElement(oBrowser.findElement(By.xpath("//label"))).perform();
            Thread.sleep(2000);

            //2. click on "Choose File" button
            oBrowser.findElement(By.xpath("//input[@id='uploadFile']")).click();
            Thread.sleep(2000);


            Runtime.getRuntime().exec("C:\\Users\\Dell\\Downloads\\Example.exe");
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            oBrowser= null;
            oAction = null;

        }

    }
}
