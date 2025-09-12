package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector {
    public static void main(String[] args) {
        css_selector();
    }
    public static void css_selector() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

           // chrome.navigate().to("file:///C:/Users/Dell/Downloads/SampleWebTables.html");
            chrome.navigate().to("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html");

           // chrome.findElement(By.cssSelector("html body form input")).sendKeys("aaaaaaaa");

            //Using AC find first username?
            // chrome.findElement(By.cssSelector("html body form[id = 'frm1'] input")).sendKeys("aaaaaaaa");
            // chrome.findElement(By.cssSelector("html body form[id = 'frm1'] input")).sendKeys("aaaaaaaa");
          //  chrome.findElement(By.cssSelector("html body form[id = 'frm1']")).sendKeys("aaaaaaaa");
           //  chrome.findElement(By.cssSelector("html body form[id = 'frm1_un_id']")).sendKeys("aaaaaaaa");

          //Using AC find first password?
          //   chrome.findElement(By.cssSelector("html body form input[id = 'frm1_pwd_id']")).sendKeys("aaaaaaaa");
             //  chrome.findElement(By.cssSelector("input[id='frm1_pwd_id']")).sendKeys("aaaaaaaa");
                 //  chrome.findElement(By.cssSelector("html body form[id='frm1']")).sendKeys("aaaaaa");

            //Using AC find second username?
              // chrome.findElement(By.cssSelector("html body form[id='frm2']input")).sendKeys("aaaaaa");
            // chrome.findElement(By.cssSelector("html body form[id='frm2']")).sendKeys("aaaaaa");
             // chrome.findElement(By.cssSelector("input[id='frm1_un_id']")).sendKeys("aaaaaa");

            //Using AC find second password?
            // chrome.findElement(By.cssSelector("input[id='frm1_pwd_id']")).sendKeys("aaaaaa");
            // chrome.findElement(By.cssSelector("html body form[id='frm2']")).sendKeys("aaaaaa");



            //Relative CSS Selector
            //Using tagName
            //identify the first username




            //Using attribute name and value
            //Identify the first username?
           // chrome.findElement(By.cssSelector("input[id = 'frm1_un_id']")).sendKeys("aaaaaaaa");

            //Using more than one attribute name and value
            //Identify the first username?
          //  chrome.findElement(By.cssSelector("input[id = 'frm1_un_id'][type = 'text']")).sendKeys("aaaaaaaa");
        // chrome.findElement(By.cssSelector("input[name = 'frm1_un_name'][type = 'text']")).sendKeys("aaaaaa");


            //Using not logical operator
            //Find the link which doesnot have target attribute ?
          //  chrome.findElement(By.cssSelector("a:not([target])")).click();


            //Using partial matches
            //Starts-with(^)
            //Enter first username value?
            // chrome.findElement(By.cssSelector("input[id^='frm1_un_i']")).sendKeys("aaaaaa");

             //ends-with($)
            //Enter first username value ?
          //  chrome.findElement(By.cssSelector("input[id$='1_un_id']")).sendKeys("aaaaaa");

            //contains(*)
            //Enter first username value?
            // chrome.findElement(By.cssSelector("input[id*='1_un_id']")).sendKeys("aaaaaa");

            //Using regular expressions
            //Identify the first username?
            // chrome.findElement(By.cssSelector("*[id='frm1_un_id']")).sendKeys("aaaaaa");

           //Using parent hierarchy
            //Identify the first username?
           // chrome.findElement(By.cssSelector("form[id='frm1']>input[id='frm1_un_id']")).sendKeys("aaaaaa");


            //Using child
            //Identify the first element in the form parent tag?
            //first-child
            // chrome.findElement(By.cssSelector("form[id='frm1']>:first-child")).sendKeys("aaaaaa");

            //last-child
            // chrome.findElement(By.cssSelector("form[id='frm1']>:last-child")).sendKeys("aaaaaa");

             //nth-child
             chrome.findElement(By.cssSelector("form[id='frm1']>:nth-child(4)")).sendKeys("aaaaaa");








        }catch(Exception e) {
            e.printStackTrace();
            chrome = null;

        }
    }
}








