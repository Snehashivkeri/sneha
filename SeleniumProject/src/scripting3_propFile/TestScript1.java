package scripting3_propFile;

import org.openqa.selenium.WebDriver;
import scripting2.ReusableMethods;

import java.util.Map;

import static scripting3_propFile.ReusableMethods.getPropData;


public class TestScript1 extends ReusableMethods {
    public static void main(String[] args) {
        TS_LoginLogout();
        TS_createAndDeleteUser();

    }

    public static void TS_LoginLogout() {
        WebDriver oBrowser = null;
        Map<String, String> data = null;
        try {
            data = getPropData("TestData");
            oBrowser = launchBrowser(data.get("browserName"));
            boolean blnRes = navigateURL(oBrowser, "url");
            blnRes = loginToApplication(oBrowser, data.get("userName"), data.get("password"));
            blnRes = logoutFromActiTime(oBrowser);
        } catch (Exception e) {
            System.out.println("Exception in 'TS_LoginLogout' test script");

        } finally {
            oBrowser.close();
            oBrowser = null;
        }
    }


    public static void TS_createAndDeleteUser() {
        WebDriver oBrowser = null;
        Map<String, String> data = null;
        try {
            data = getPropData("TestData");
            oBrowser = launchBrowser(data.get("browserName"));
            boolean blnRes = navigateURL(oBrowser, data.get("url"));
            blnRes = loginToApplication(oBrowser, data.get("userName"), data.get("password"));


            String userName = createUser(oBrowser, data);
            blnRes = deleteUser(oBrowser, userName);
            blnRes = logoutFromActiTime(oBrowser);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            oBrowser.close();
            oBrowser = null;

        }
    }
}


