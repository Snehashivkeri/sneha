package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
    public static void main(String[] args) {
         xpath1();
    }
    public static void xpath1() {
        ChromeDriver chrome = null;
        try {
            chrome = new ChromeDriver();
            chrome.manage().window().maximize();

         chrome.navigate().to("file:///C:/Users/Dell/Downloads/SampleWebTables.html");
         //  chrome.navigate().to("file:///C:/Users/Dell/Downloads/Sample%20Web%20Project.html");
        // USING AX FIND FIRST PASSWORD?
          //  chrome.findElement(By.xpath("/html/body/form/input[2]")).sendKeys("aaaaaaaa");
            //  chrome.findElement(By.xpath("/html/body/form[1]/input[2]")).sendKeys("bbbbbbbb");
          //  chrome.findElement(By.xpath("/html/body/form[@id='frm1]/input[2]")).sendKeys("aaaaaa");
           // chrome.findElement(By.xpath("/html/body/form[@id='frm1']/input[@id='frm1_pwd_id]")).sendKeys("bbbbbbb");


           // USING AX FIND SECOND USERNAME?
      // chrome.findElement(By.xpath("/html/body/form[2]/input[1]")).sendKeys("bbbbbbb");
       //  chrome.findElement(By.xpath("/html/body/form[@id='frm2']/input[1]")).sendKeys("aaaaaaaa");
        //  chrome.findElement(By.xpath("/html/body/form[@id='frm2']/input[@id='frm1_un_id']")).sendKeys("bbbbbbb");

         // USING AX FIND THE SECOND LINK?
          //  chrome.findElement(By.xpath("/html/body/a[2]")).click();
           //   chrome.findElement(By.xpath("/html/body/a[@id='link2_id'")).click();
              //  chrome.findElement(By.xpath("/html/body/a[@name='link2_name]")).click();
       //  chrome.findElement(By.xpath(" /html/body/a[@id='link2_id' and @target='_blank']")).click();

            //USING AX FIND SECOND PASSWORD?
          //  chrome.findElement(By.xpath("/html/body/form[2]/input[2]")).sendKeys("bbbbbbbb");
          //  chrome.findElement(By.xpath(" /html/body/form[@id='frm2']/input[2]")).sendKeys("bbbbbbb");
              // chrome.findElement(By.xpath("/html/body/form[@id='frm2']/input[@id='frm1_pwd_id'")).sendKeys("aaaaaaa");

           // USING ATTRIBUTE NAME AND VALUE
            //ENTER VALUE FOR FIRST USERNAME?
           // chrome.findElement(By.xpath("//input[@id='frm1_un_id']")).sendKeys("aaaaaaa");
           // chrome.findElement(By.xpath("//input[@name='frm1_un_name']")).sendKeys("aaaaaaa");
           // chrome.findElement(By.xpath("//input[@placeholder='Enter UserName']")).sendKeys("aaaaaaa");

            //USING MORE THAN ONE ATTRIBUTE NAME AND VALUE?
          // chrome.findElement(By.xpath("//input[@id='frm1_un_id'][@name='frm1_un_name']")).sendKeys("aaaaaaa");
          //  chrome.findElement(By.xpath("//input[@id='frm1_un_id'][@class='frm1_un_class']")).sendKeys("aaaaaaa");
          //  chrome.findElement(By.xpath("//input[@id='frm1_un_id'][@placeholder='Enter UserName']")).sendKeys("aaaaaaa");

          //USING and LOGICAL OPERATORS
           // chrome.findElement(By.xpath("//input[@id='frm1_un_id' and @name='frm1_un_name']")).sendKeys("aaaaaaa");
           // chrome.findElement(By.xpath("//input[@id='frm1_un_id' and @class='frm1_un_class']")).sendKeys("aaaaaaa");

           //USING or LOGICAL OPERATORS
           // chrome.findElement(By.xpath("//input[@id='frm1_un_id' or @name='frm1_un_name']")).sendKeys("aaaaaaa");
           // chrome.findElement(By.xpath("//input[@id='frm1_un_id' or @placeholder='Enter UserName']")).sendKeys("aaaaaaa");

           //USING NOT LOGICAL OPERATORS
           // chrome.findElement(By.xpath("//a[not(@target='_blank']")).click();

            //USING text() method
            //FIND header, paragraph and link using text method ?
           // String text = chrome.findElement(By.xpath("//h1[text()='Header One']")).getText();
           // String text = chrome.findElement(By.xpath("//p[text()='Sample paragraphs One']")).getText();
           // String text = chrome.findElement(By.xpath("//a[text()='ActiTime']")).getText();

          //USING INDEX
            //IDENTIFY THE USERNAME USING INDEX ?
           // chrome.findElement(By.xpath("//input[@name = 'frm1_un_name']")).sendKeys("aaaaaaa");    // without index
            // chrome.findElement(By.xpath("(//input[@name = 'frm1_un_name'])[1]")).sendKeys("bbbbbbbb");   //with index
             //chrome.findElement(By.xpath("/html/body/form/input[1]")).sendKeys("aaaaaaa");
             // chrome.findElement(By.xpath("(/html/body/form[1]/input[1])[1]")).sendKeys("aaaaaa");
             // chrome.findElement(By.xpath("(/html/body/form/input[1])[1]")).sendKeys("bbbbbbbb");

             //USING PARTIAL MATCHES
            // starts-with()
            // If the first username attributes are changing (ex id attribute values) at the end of the attribute values. Then use starts-with()
          //  chrome.findElement(By.xpath("//input[starts-with(@id, 'frm1_un_i')]")).sendKeys("aaaaaaa");

            // ends-with()
            // If the first username attributes are changing (ex id attribute values) at the beginning of the attribute values. Then use ends-with()
           // chrome.findElement(By.xpath("//input[ends-with(@id, 'm1_un_id')]")).sendKeys("aaaaaaa");

            //contains()
            // If the first username attributes are changing (ex id attribute values) at the beginning/middle/end of the attribute values. Then use contains()
          //  chrome.findElement(By.xpath("//input[contains(@id, 'm1_un_id')]")).sendKeys("aaaaaaa");

           //Xpath Axis
            // following-sibling: It travels in forward dir. within one row OR within next level.
            // Identify the password by starting from username ?
          //  chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/following-sibling::input[1]")).sendKeys("aaaaaaa");
           // Identify the designation for 'Abdul Kalam'?
          // String text =   chrome.findElement(By.xpath("//td[text() = 'Abdul Kalam']/following-sibling::td[1]")).getText();

            // following: It travels in forward dir. within one row or many rows or multiple levels. The following can act as following-sibling & following.
            //Identify the password by starting from username ?
            // chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/following::input[1]")).sendKeys("aaaaaaa");

            //Identify bys the username by starting from the pre paragraph three and move to down direction?
            // chrome.findElement(By.xpath("//pre[contains(text(), 'Three')]/following::input[1]")).sendKeys("aaaaaaa");

         // String text =  chrome.findElement(By.xpath("//td[text() = 'Abdul Kalam']/following::tr[1]/td[1]")).getText();

           //preceding-sibling: It travels in a backward dir. within one row or one level.
            //Identify the username by starting from the password and move in backward dir.?
            // chrome.findElement(By.xpath("//input[@id = 'frm1_pwd_id']/preceding-sibling::input[1]")).sendKeys("aaaaaaaa");

            //Find a person name whose designation is indian scientist
          //  String text =  chrome.findElement(By.xpath("//td[text() = 'Indian Scientist']/preceding-sibling::td[1]")).getText();

            //preceding: It can travel in backward dir. within one row or multiple rows or multiple levels and upward direction
            //Enter password by starting from OK button and travels in upward dir.?
          //  chrome.findElement(By.xpath("//input[@id = 'frm1_ok_id']/preceding::input[1]")).sendKeys("aaaaaaaa");

          //Identify the person name who is above Narendra Modi ?
         // String text =   chrome.findElement(By.xpath("//td[text() = 'Narendra Modi']/preceding::tr[1]/td[1]")).getText();

           //ancestor: It travels in backward dir. from child element towards parent element.
           //Identify the parent from id in which first username exist ?
             // chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/ancestor::form")).sendKeys("aaaaaaaa");
           //  chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/ancestor::body")).sendKeys("aaaaaaaa");
           // chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/ancestor::html")).sendKeys("aaaaaaaa");

          //Identify the table id in which smriri irani exist?
           // String text = chrome.findElement(By.xpath("//td[text() = 'Smruthi Irani']/ancestor::table")).getText();


            //descendant: It goes in a forward dir. to the child element.
            //Starting from the body identify its child element username and enter the value?
            // chrome.findElement(By.xpath("//body/descendant::input[1]")).sendKeys("aaaaaaaa");

            //Starting from the body, get the abdul kalam cell ?
           // String text = chrome.findElement(By.xpath("//body/descendant::td[text() = 'Abdul Kalam']")).getText();

          //parent: It travels to the next immediate parent element
            //Identify the parent element for the first username and read its id ?
           //  chrome.findElement(By.xpath("//input[@id = 'frm1_un_id']/parent::form")).sendKeys("aaaaaaaa");

            //Identify the parent id from the tbody ?
           //  chrome.findElement(By.xpath("//tbody/parent::table"));

            //child: It will travel to immediate child only.
            //Identify the first username from its parent form ?
             // chrome.findElement(By.xpath("//form[@id = 'frm1']/child::input")).sendKeys("aaaaaaaa");

           //Identify the first person name in the webtable(person details)?1
           // chrome.findElement(By.xpath("//table[@id='table2']/tbody/tr/child::td"));

            //USING REGULAR EXPRESSIONS: Regular expression in xpath can be used in 2 places only:
            // 1. tagName
            // 2. attribute name


            //USING PARENT HIERARCHY: If the element is not identifiable using the expression matching directly to the element, we can start the xpath from its parent.

            //DYNAMIC xpath: Writing the xpath in which attribute name is parameterized.
            String name = "Narendra Modi";
            String text = chrome.findElement(By.xpath("//table[@id='table2']/tbody/tr/td[text()='"+name+"']")).getText();
             System.out.println(text);








            //CSS SELECTOR
          //  chrome.findElement(By.xpath("html body form input")).sendKeys("aaaaaaaa");










        }catch(Exception e) {
            e.printStackTrace();
            chrome = null;

        }
    }
}
